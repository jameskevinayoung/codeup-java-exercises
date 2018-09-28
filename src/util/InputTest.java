package util;

import java.util.InputMismatchException;

public class InputTest {
    public static void main (String[] args){

        Input input = new Input();
        System.out.println("Please enter an integer");

        //initialize the variables outside of any methods to be able to reuse further in the code.
//        String num = "0";
        int num = 0;
//        String nums = " ";
//        double nums = 0;

//        System.out.println(num);
//        System.out.println(nums);
        //use the try/cat blocks

//        try{
//            num =input.getString();
            num =input.getInt();
//            nums = input.getString();
//            nums = input.getInt();
//            Integer.valueOf(num);
//            Double.valueOf(nums);

            System.out.println(num);
//            System.out.println(nums);
//        }catch (InputMismatchException e){
//            System.out.println("Not valid number");
//            System.out.println("Please enter an integer");
//        }

        System.out.println("Thank you!");




    }

}
