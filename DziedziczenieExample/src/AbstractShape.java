public abstract class AbstractShape {

    protected Ecolor color;


    public AbstractShape(Ecolor color) {
        this.color = color;
    }

    public Ecolor getColor() {
        return color;
    }

    public void setColor(Ecolor color) {
        this.color = color;
    }

    public abstract double getPerimeter();
    public abstract double getSurface();
}
