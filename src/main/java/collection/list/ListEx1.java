package collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListEx1 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(new Data(1, "DELETE"), new Data(2, "DELETE"), new Data(5, "ADD"), new Data(9, "ADD"));

        List<Data> filteredData = filter(dataList);
        System.out.println(filteredData); // [1, 5]
    }

    private static List<Data> filter(List<Data> dataList) {

        List<Data> filteredData = new ArrayList<>();

        List<Integer> ids = getOnlyId(dataList);

        List<Integer> existingIdsFromDatabase = getExistingIdsFromDatabase(ids);


        // data that is intended for DELETE should be present in db
        List<Data> deleteData = getDeleteData(dataList);
        for(Data dd: deleteData) {
            int id = dd.getId();
            if(existingIdsFromDatabase.contains(id)) {
                filteredData.add(dd);
            }
        }

        // data that is intended for ADD should not be present in db
        List<Data> addData = getAddData(dataList);
        for(Data ad : addData) {
            int id = ad.getId();
            if(!existingIdsFromDatabase.contains(id)) {
                filteredData.add(ad);
            }
        }

        return filteredData;
    }
    static List<Data>  getDeleteData(List<Data> dataList)
    {
        List<Data> deleteData= new ArrayList<>();

        for(Data data: dataList)
        {
            String action =data.getAction();
            if(action.equals("DELETE"))
            {
                deleteData.add(data);
            }

        }
        return deleteData;
    }

    static List<Data> getAddData(List<Data> dataList)
    {
        List<Data> addData= new ArrayList<>();

        for(Data data: dataList)
        {
            String action =data.getAction();
            if(action.equals("ADD"))
            {
                addData.add(data);
            }

        }
        return addData;
    }


    public static List<Integer> getOnlyId(List<Data> l) {
        List<Integer> ids = new ArrayList<>();
        for(Data data : l) {
            int id = data.getId();
            ids.add(id);
        }
        return ids;
    }


    public static List<Integer> getExistingIdsFromDatabase(List<Integer> ids) {
        // database mock function
        // assumes ids 1 9 is present in database
        return List.of(1, 9);
    }

    private static List<Data> filterOtherWay(List<Data> dataList) {
        List<Integer> ids = dataList.stream()
                .map(Data::getId)
                .collect(Collectors.toList());

        Set<Integer> existingIdsFromDatabase = new HashSet<>(getExistingIdsFromDatabase(ids));

        return dataList.stream()
                .filter(data -> {
                    String action = data.getAction().toUpperCase();
                    int id = data.getId();
                    return ("DELETE".equals(action) && existingIdsFromDatabase.contains(id)) ||
                            ("ADD".equals(action) && !existingIdsFromDatabase.contains(id));
                })
                .collect(Collectors.toList());
    }


}
