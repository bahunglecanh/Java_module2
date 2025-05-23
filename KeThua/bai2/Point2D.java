package KeThua.bai2;

public class Point2D {
    public float x=0.0f;
    public float y=0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2DV1=new Point2D();
        System.out.println("Default: "+point2DV1);
        Point2D point2DV2=new Point2D(3.5f,4.5f);
        System.out.println("With value: "+point2DV2);
        point2DV2.setX(5.5f);
        point2DV2.setY(6.5f);
        System.out.println("After set X and Y: "+point2DV2);
        point2DV2.setXY(4.8f,9.6f);
        System.out.println("After setXY: "+point2DV2);
        float [] coords=point2DV1.getXY();
        System.out.println("getXY returns: (" + coords[0] + ", " + coords[1] + ")");
    }
}
