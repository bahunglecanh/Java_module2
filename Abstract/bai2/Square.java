package Abstract.bai2;

public class Square implements Colorable{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge*edge;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    public static void main(String[] args) {
            Square[] squares = new Square[] {
                    new Square(2),
                    new Square(5),
                    new Square(10)
            };

            for (Square sq : squares) {
                System.out.println(sq);
                System.out.printf("Area: %.2f\n", sq.getArea());
                sq.howToColor();  // Gọi phương thức của Colorable
                System.out.println("----------------");
            }
    }
}
