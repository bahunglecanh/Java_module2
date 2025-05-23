package KeThua.bai3;

public class Point {
    public float x=0.0f;
    public float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point pointv1=new Point();
        System.out.println("Default: "+pointv1);
        Point pointv2=new Point(3.2f,3.1f);
        System.out.println("With value: "+pointv2);
        pointv2.setX(5.5f);
        pointv2.setY(6.5f);
        System.out.println("After set X and Y: "+pointv2);
        pointv2.setXY(4.8f,9.6f);
        System.out.println("After setXY: "+pointv2);
        float [] coords=pointv2.getXY();
        System.out.println("getXY returns: (" + coords[0] + ", " + coords[1] + ")");
    }
}
