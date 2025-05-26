package Abstract.bai1;

public class Retangle implements Resizeable{
    private double width;
    private double height;

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height*width;
    }

    @Override
    public void resize(double percent) {
        width*=(1+percent/100.0);
        height*=(1+percent/100.0);
    }

    @Override
    public String toString() {
        return String.format("Retangle{" +
                "width=" + width +
                ", height=" + height +
                '}');
    }
}
