package shapes;

public class Circle {


    private double radius;

    public Circle(double radius){

    }

    public double getArea(){
        double pi = Math.PI;
        double area = pi * (radius * radius);

        return area;
    }

    public double getCircumference(){
        double pi = Math.PI;
       return 2 * pi * radius;
    }




}
