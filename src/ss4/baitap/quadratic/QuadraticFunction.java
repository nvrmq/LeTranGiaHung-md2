package ss4.baitap.quadratic;

import java.util.Scanner;

public class QuadraticFunction {
    double a;
    double b;
    double c;
    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - (4* this.c* this.a);
    }
    public double getRoot1(){
        if (this.getDiscriminant() >= 0){
            return (((-1)*this.b) + Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        } else {
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant() >= 0){
            return (((-1)*this.b) - Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        } else {
            return 0;
        }
    }
}