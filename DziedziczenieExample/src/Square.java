public class Square extends Rectangle {


    public Square(Ecolor color, double a) {
        super(color, a, a);
    }

    @Override
    public void setA(double a) {
        setSide(a);
    }

    @Override
    public void setB(double b) {
        setSide(b);
    }

    private void setSide(double side){
        super.setA(side);
        super.setB(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", color=" + color +
                '}';
    }
}
