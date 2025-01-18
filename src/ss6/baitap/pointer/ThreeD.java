package ss6.baitap.pointer;

public class ThreeD extends TwoD {
    private float z = 0.0f;
    public ThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public ThreeD() {}
    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), z};
    }
    public String toString() {
        return "x=" + getX() + ", y=" + getY() + ", z=" + z;
    }
}
