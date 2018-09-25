package shapes;
//part 4.a
public abstract class Quadrilateral extends Shape implements Measurable{


    //part 4.b

    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //abstract setters for length, width
    public abstract void setLength(int length);

    public abstract void setWidth(int width);








}
