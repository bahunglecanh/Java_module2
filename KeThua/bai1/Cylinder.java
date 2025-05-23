package KeThua.bai1;

public class Cylinder extends Circle{
    public double height;

    public Cylinder(double radius, double color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}
