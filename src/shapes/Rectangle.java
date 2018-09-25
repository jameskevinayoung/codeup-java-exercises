package shapes;
//Interfaces and abstract exercises part 1.a
public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}

//    //created two protected properties for length and width
//
//    protected int length;
//    protected int width;
//
//    //created a Rectangle constructor that takes two integer parameters (length and width)
//    //and sets the length and width properties to those parameters;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    //part 1.b
//
//    //created two methods (getArea, getPerimeter) that takes in two integer parameters (length and width)
//    //prints out a message "Area is: " and returns the length times the width;
//    //prints out a message "Perimeter is: " and returns the length times 2 plus the width times 2;
//    //the getArea method doesn't need to have parameters because it is dealing with each instance we get length and width;
//    //the getPerimeter method doesn't need to have parameters because it is dealing with each instance we get length and width;
//
//
//    public int getArea(){
//        int area = this.length* this.width;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = (2* this.length) + (2* this.width);
//        return perimeter;
//    }