package ss6.baitap.pointer;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        TwoD point2D1 = new TwoD();
        TwoD point2D2 = new TwoD(1.69f, 3.2f);
        point2D1.setXY(6.9f, 2.3f);
        System.out.println(point2D1);
        System.out.println(point2D2);

        System.out.println("-----ARRAY-----");
        float[] points2DArray1 = point2D1.getXY();
        float[] points2DArray2 = point2D2.getXY();
        System.out.println(Arrays.toString(points2DArray1));
        System.out.println(Arrays.toString(points2DArray2));

        System.out.println("-----3D-----");
        ThreeD point3D1 = new ThreeD();
        ThreeD point3D2 = new ThreeD(1.72f, 5.98f, 2.3f);
        point3D1.setXYZ(1.88f, 2.65f, 7.23f);
        System.out.println(point3D1);
        System.out.println(point3D2);

        System.out.println("-----ARRAY-----");
        float[] points3DArray1 = point3D1.getXYZ();
        float[] points3DArray2 = point3D2.getXYZ();
        System.out.println(Arrays.toString(points3DArray1));
        System.out.println(Arrays.toString(points3DArray2));
    }
}
