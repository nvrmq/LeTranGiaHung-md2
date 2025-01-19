package casestudy.traffic.models;

public class Truck extends Vehicle {
    private double payLoad;

    public Truck(String licensePlate, String manufacturer, int productionYear, String owner, double payLoad) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.payLoad = payLoad;
    }
    public double getPayLoad() {
        return payLoad;
    }
    public void setPayLoad(double payLoad) {
        this.payLoad = payLoad;
    }
    public String toString() {
        return getLicensePlate() + "," +
                getManufacturer() + "," +
                getProductionYear() + "," +
                getOwner() + "," +
                getPayLoad();
    }
}
