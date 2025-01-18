package ss6.baitap.pointer;

import java.awt.*;

public class TwoD {
    private float x = 0.0f;
    private float y = 0.0f;
    public TwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public TwoD() {}
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{x, y};
    }
    public String toString() {
        return "x=" + x + ", y= " + y;
    }
}
