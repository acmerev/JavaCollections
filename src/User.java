

public class User {

    private String name;
    private String numberID;

    public User(String name, String numberID) {
        this.name = name;
        this.numberID = numberID;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", numberID='" + numberID + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public String getName() {
        return name;
    }

    public String getNumberID() {
        return numberID;
    }
}
