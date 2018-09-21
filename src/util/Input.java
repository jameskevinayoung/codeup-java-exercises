package util;

import java.util.Scanner;

public class Input {

    private Scanner inputScanner = new Scanner(System.in);


    public String getString(){
        return this.String;
    }
    public boolean yesNo(){

        String response = inputScanner.next();
        if(response.equals("y")) return true;
        else return false;

    }

    public int getInt(int min, int max){//we have an integer method; 2 parameters (min and max integer)
        int integerInput = inputScanner.nextInt();//take user input and hold in an int variable
        if(integerInput < min || integerInput> max){//if that input is less than min or greater the max;
            System.out.println("You are outside the range. Please choose again");//let them know they're outside the range
            return getInt(min,max);//recall the function
        }else {
            System.out.println("Your number was in range");
            return integerInput;
        }
    }
    public int getInt(){
        int integerInput = inputScanner.nextInt();
        return integerInput;
    }


    public double getDouble(double min, double max){//we have an double method; 2 parameters (min and max)
        double doubleInput = inputScanner.nextInt();//take user input and hold in an double variable
        if(doubleInput < min || doubleInput> max){//if that input is less than min or greater the max;
            System.out.println("You are outside the range. Please choose again");//let them know they're outside the range
            return getDouble(min,max);//recall the function
    }
    public double getDouble(){
            doubleInput = inputScanner.nextInt();//take user input and hold in an double variable
            return doubleInput;

    }



}
