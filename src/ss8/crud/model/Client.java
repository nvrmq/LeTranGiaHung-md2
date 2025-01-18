package ss8.crud.model;

public class Client {
    private int id;
    private String name;
    private int birthYear;
    private String address;
    public Client(int id, String name, int birthYear, String address) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name '" + name + '\'' +
                ", birthyear " + birthYear +
                ", address '" + address + '\'' +
                '}';
    }
}
