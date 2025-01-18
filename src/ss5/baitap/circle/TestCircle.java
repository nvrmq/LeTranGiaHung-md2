package ss5.baitap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area is " + circle.getArea());
        System.out.println("Radius is " + circle.getRadius());
        Circle circle2 = new Circle(5);
        System.out.println("Area is " + circle2.getArea());
        System.out.println("Radius is " + circle2.getRadius());
    }
}
