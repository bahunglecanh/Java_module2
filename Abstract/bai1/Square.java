package Abstract.bai1;

public class Square extends Retangle{


    public Square(double edge) {
        super(edge, edge);
    }
    public double getEdge(){
        return super.getArea()/super.getHeight();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public String toString() {
        return  String.format("Square(side=%.2f)", getEdge());
    }
}
