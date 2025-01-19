package casestudy.traffic.models;

public class Cars extends Vehicle {
    private String carType;
    private int seats;
    public Cars(String licensePlate, String manufacturer, int productionYear, String owner, String carType, int seats) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.carType = carType;
        this.seats = seats;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String toString() {
        return  getLicensePlate() + "," +
                getManufacturer() + "," +
                getProductionYear() + "," +
                getOwner() + "," +
                getCarType() + "," +
                getSeats();
    }
}
