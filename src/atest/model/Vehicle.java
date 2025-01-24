package atest.model;

public class Vehicle {
    private String licensePlate;
    private String manufacturer;
    private int productionYear;
    private String owner;

    public Vehicle(String licensePlate, String manufacturer, int productionYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.owner = owner;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String toString() {
        return licensePlate + ", " + manufacturer + ", " + productionYear + ", " + owner;
    }
}
