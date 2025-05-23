package KeThua.bai2;

public class Point3D extends Point2D{
    public float z=0.0f;

    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x, y);
        this.z=z;
    }
    public float [] getXYZ(){
        float[] xy = getXY();
        return new float[]{xy[0],xy[1],z};
    }

    @Override
    public String toString() {
         return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println("Default Point3D: " + p1);

        Point3D p2 = new Point3D(3.5f, 4.5f, 5.5f);
        System.out.println("Point3D with values: " + p2);

        p2.setX(7.0f);
        p2.setY(8.0f);
        p2.setZ(9.0f);
        System.out.println("After setX, setY and setZ: " + p2);

        p2.setXYZ(1.1f, 2.2f, 3.3f);
        System.out.println("After setXYZ: " + p2);

        float[] coords = p2.getXYZ();
        System.out.println("getXYZ returns: (" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");

    }
}
