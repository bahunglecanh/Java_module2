package Abstract.bai1;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public void resize(double percent) {
        radius*=(1+percent/100.0);
    }

    @Override
    public String toString() {
        return String.format("Circle{" +
                "radius=" + radius +
                '}');
    }
}
