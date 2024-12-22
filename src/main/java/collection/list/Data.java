package collection.list;

public class Data {

    int id;
    String action;

    public Data(int id, String action) {
        this.id = id;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", action='" + action + '\'' +
                '}';
    }
}
