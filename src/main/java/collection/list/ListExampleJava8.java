package collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListExampleJava8 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(new Data(1, "DELETE"), new Data(2, "DELETE"), new Data(5, "ADD"), new Data(9, "ADD"));

        List<Data> filteredData = filterOtherWay(dataList);
        System.out.println(filteredData); // [1, 5]
    }

    private static List<Data> filter(List<Data> dataList) {

        List<Data> filteredData = new ArrayList<>();

        List<Integer> ids = dataList.stream().map(data -> data.getId()).collect(Collectors.toList());
        List<Integer> existingIdsFromDatabase = getExistingIdsFromDatabase(ids);

        List<Data> deleteData = dataList.stream().filter(data -> data.getAction().equalsIgnoreCase("DELETE")).collect(Collectors.toList());
        List<Data> addData = dataList.stream().filter(data -> data.getAction().equalsIgnoreCase("ADD")).collect(Collectors.toList());

        deleteData.stream().forEach(dd -> {
            if(existingIdsFromDatabase.contains(dd.getId())) {
                filteredData.add(dd);
            }
        });

        addData.stream().forEach(dd -> {
            if(!existingIdsFromDatabase.contains(dd.getId())) {
                filteredData.add(dd);
            }
        });

        return filteredData;
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


    public static List<Integer> getExistingIdsFromDatabase(List<Integer> ids) {
        // database mock function
        // assumes ids 1 9 is present in database
        return List.of(1, 9);
    }
}
