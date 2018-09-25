package shapes;
//part 1.c
public class Square extends Rectangle {


//part 1.i
protected int side;




//part 1.d

    //create a square constructor that takes one integer parameter called side
    //call the rectangle constructor from superclass Rectangle that uses length and width to determine the side
    public Square(int side) {
        //squares are Rectangles that have length and width;
        //when you are calling the superclass Rectangle it is providing you with length and width;
        //a square has four equal sides so the length and the width are the same;
        //so you would pass the argument for the length as a side, and the width as a side;

        super(side, side);//now call the superclass Rectangle with your side parameter;


        //part 1.i
        this.side = side;//call the Square constructor you have to use the "this." instance to equal side;


    }
    //part 1.i
// to override the getter you must have different parameters, order, or properties;
    //you have to create a protected property called side;
    //then use "this.side" instance in your Square methods to override perimeter and area getters.


    public int getPerimeter(){
        return 4 * this.side;
    }

    public int getArea(){
        return this.side * this.side;
    }


}
