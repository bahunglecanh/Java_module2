package KeThua.bai3;

public class MovablePoint extends Point{
    public float xSpeed;
    public float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+ "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Default : " + mp1);

        MovablePoint mp2 = new MovablePoint(3.5f, 4.5f);
        System.out.println("With value: " + mp2);

        MovablePoint mp3 = new MovablePoint(1.0f, 2.0f, 5.0f, 6.0f);
        System.out.println(" With position and speed: " + mp3);

        mp3.move();
        System.out.println("After move(): " + mp3);

        mp3.setSpeed(10f, 10f);
        mp3.move();
        System.out.println("After setSpeed and move(): " + mp3);

        float[] speed = mp3.getSpeed();
        System.out.println("Current speed: (" + speed[0] + ", " + speed[1] + ")");
    }
}
