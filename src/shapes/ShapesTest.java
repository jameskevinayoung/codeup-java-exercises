package shapes;

import org.w3c.dom.css.Rect;

//part 1.e
public class ShapesTest {

    public static void main(String[] args){

        Measurable myShape = new Rectangle(4, 3);//if you re-casted this as a square you would need to change the parameters

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(((Rectangle) myShape).getLength());
        System.out.println(((Rectangle) myShape).getWidth());

//it is identifying that this is casted as a rectangle if you change this it will not work because the method is expecting a Rectangle
//object only.













        //part 1.f
    //create a rectangle type called box1

//        Rectangle box1 = new Rectangle(5, 4);

        //used .method() on the new instance of Rectangle, but didn't work at first because the methods were static;
        //after removal of static from the methods, take off the parameters and input the "this." property (this.length/this.width);
        //then print box1.getArea/getPerimeter() to confirm the box's area is 20 and perimeter is 18;

        //part 1.g
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

        //part 1.h
//        Rectangle box2 = new Square(5);

        //part 1.i
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());


        //part 1.j

        //How can you determine which getArea and getPerimeter methods are being called on each object?
        /**
         * Answer: You can identify the which getter methods are being used by which class is being called.
         * Example: box1 is a new rectangle constructed with two arguments (length, width).
         * This uses those arguments as the length and width instances and applies them to those variables in the Rectangle
         * getArea/Perimeter methods.
         *
         * box2 is a rectangle that is constructed as a square and takes in one argument (side).
         * This uses that argument as the side instance that was created from the side property just as length and width,
         * and applied them to the side variable for the getArea/Perimeter methods that override the Rectangle getArea/Perimeter methods
         */



















    }


}
