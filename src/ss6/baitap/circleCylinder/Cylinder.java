package ss6.baitap.circleCylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {

    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolumn() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Radius: " + getRadius() + "Color" + getColor() + " Height: " + getHeight() + " Volumn: " + getVolumn();
    }
}
