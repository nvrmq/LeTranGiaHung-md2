package ss6.baitap.circleCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("red");
        System.out.println("-----Circle is-----");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(9);
        cylinder.setColor("green");
        cylinder.setHeight(14);
        System.out.println("-----Cylinder is-----");
        System.out.println(cylinder);
    }
}
