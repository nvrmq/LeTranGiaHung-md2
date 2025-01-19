package casestudy.traffic.models;

public class Motocycle extends Vehicle {
    private int engineCapacity;

    public Motocycle(String licensePlate, String manufacturer, int productionYear, String owner, int engineCapacity) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.engineCapacity = engineCapacity;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public String toString() {
        return getLicensePlate() + "," +
                getManufacturer() + "," +
                getProductionYear() + "," +
                getOwner() + "," +
                getEngineCapacity();
    }
}
