package ss16.crudtextfile.bt.mvc.model;

public class Customer {
    private int id;
    private String name;
    private String dob;
    private String address;

    public Customer(int id, String name, String dob, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
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
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toCSV(){
        return id + "," + name + "," + dob + "," + address;
    }
    public String toString(){
        return "Customer {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", dob = '" + dob + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
    public static Customer fromCSV(String csv){
        String[] data = csv.split(",");
        return new Customer(Integer.parseInt(data[0]), data[1], data[2], data[3]);
    }
}
