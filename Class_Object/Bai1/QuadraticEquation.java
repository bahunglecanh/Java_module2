package Class_Object.Bai1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1(){
        double delta=getDiscriminant();
        if (delta<0){
            return 0;
        }
        return (-b+Math.pow(delta,0.5))/(2*a);
    }
    public double getRoot2(){
        double delta=getDiscriminant();
        if (delta<0){
            return 0;
        }
        return (-b-Math.pow(delta,0.5))/(2*a);
    }

}
