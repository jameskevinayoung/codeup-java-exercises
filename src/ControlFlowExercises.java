import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i+ " ");
//            i++;
//        }

//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);
//
//        for(int j = 0; j < 10; j++) {
//            System.out.println(i);
//        }
//
//        for(char a = 'a'; a <= 'z'; a++){
//            System.out.println(a);
//        }


//EXERCISE 1 LOOP BASICS

        // 1.A WHILE LOOPS
/**        Create an integer variable i with a value of 5.
 *         Create a while loop that runs so long as i is less than or equal to 15
 *         Each loop iteration, output the current value of i, then increment i by one.
 */

//            int i = 5;
//            while(i <= 15){
//                System.out.print(i+ " ");
//                i++;
//            }
        //  1.B DO WHILE
/**
 * Create a do-while loop that will count by 2's starting with 0 and ending at 100.
 * Follow each number with a new line.
 * Alter your loop to count backwards by 5's from 100 to -10.
 * Create a do-while loop that starts at 2,
 * and displays the number squared on each line while the number is less than 1,000,000.
 * Output should equal:
 *
 * */

//            int value = 0;
//            do{
//                System.out.println(value);
//                value+=2;
//            }while(value <=100);

//            int value = 100;
//            do{
//                System.out.println(value);//prints the current value
//                value-=5; //prints each iteration of the current value until it meets the while condition
//            }while(value >= -10);

//            long squaredValue = 2;
//            do{
//                System.out.println(squaredValue);
//                squaredValue *= squaredValue;
//            }while(squaredValue < 1000000);
//
//            long squaredValue = 2;
//            do{
//                System.out.println(squaredValue);
//                squaredValue = (long)Math.pow(squaredValue,2); //written using Math.pow and casting it as a long because Math.pow uses double
//            }while(squaredValue < 1000000);


        //  1.C
/**
 * refactor the previous two exercises to use a for loop instead
 *
 * */

//            for(int x = 5; x <=15; x++){
//                System.out.println(x);
//            }


//            for(int j = 2; j <= 100; j+=2){
//                System.out.println(j);
//            }

//            for(int i = 100; i >= -10; i -= 5){
//                System.out.println(i);
//            }

//            for(long i = 2; i < 1000000; i*=i){
//                System.out.println(i);
//            }

//EXERCISE 2  FIZZBUZZ

/**
 * Write a program that prints the numbers from 1 to 100.
 * For multiples of three print “Fizz” instead of the number
 * For the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 * */

//            for(int i = 1; i <= 100; i++){
//                if(i % 15 == 0) System.out.println("FizzBuzz");
//                else if(i % 3 == 0) System.out.println("Fizz");
//                else if(i % 5 == 0) System.out.println("Buzz");
//                else System.out.println(i);
//            }




//EXERCISE 3 TABLE OF POWERS
/**
 * Prompt the user to enter an integer. Display a table of squares and cubes from 1 to the value entered. Ask if the user wants to continue.
 * Assume that the user will enter valid data. Only continue if the user agrees to.
 * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInteger1 = scanner.nextInt();



        System.out.println("Here is your table!");
        System.out.println(" number | squared | cubed");
        System.out.println("------- | ------- | -----");
        for(long f = 1; f <= userInteger1; f++){
            System.out.format("%-8s| %-8s| %-8s%n",f,f*f,f*f*f);//use format to do a table; negative number before s gives you spaces
        }






//        System.out.println("Do you want to continue? Y/N");
//        String userInput2 = scanner.next();
//
//        if (userInput2.toLowerCase().contains("y")) {
//            System.out.println("What number would you like to go up to?");
//            int userInteger3 = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("   number   |   squared   |   cubed   ");
//            System.out.println("------------|-------------|-----------");
//            for(int f = 1; f <= userInteger3; f++){
//                System.out.println(f + "           |"+ f*f+ "            |"+ f*f*f);
//            }
//        }
//        else {
//            System.out.println("Goodbye! ('-')");
//        }


//EXERCISE 4 + BONUS

//        System.out.println("Would you like to check your grade? Y/N");
//        String userConfirmation1 = scanner.next();
//        if(userConfirmation1.toLowerCase().contains("y")){
//
//            System.out.println("Please enter a numerical grade.");
//            double userGradeNumber = scanner.nextDouble(); //changed this to double to account for decimal values.
//            if(userGradeNumber >= 96){
//                System.out.println("You have an A+");
//            }
//            else if(userGradeNumber < 96 && userGradeNumber >= 92){
//                System.out.println("You have an A");
//            }
//            else if(userGradeNumber < 92 && userGradeNumber >= 88){
//                System.out.println("You have an A-");
//            }
//            else if(userGradeNumber < 88 && userGradeNumber >= 84){
//                System.out.println("You have an B+");
//            }
//            else if(userGradeNumber < 84 && userGradeNumber >= 82){
//                System.out.println("You have an B");
//            }
//            else if(userGradeNumber < 82 && userGradeNumber >= 80){
//                System.out.println("You have an B-");
//            }
//            else if(userGradeNumber < 80 && userGradeNumber >= 75){
//                System.out.println("You have an C+");
//            }
//            else if(userGradeNumber < 75 && userGradeNumber >= 72){
//                System.out.println("You have an C");
//            }
//            else if(userGradeNumber < 72 && userGradeNumber >= 67){
//                System.out.println("You have an C-");
//            }
//            else if(userGradeNumber < 67 && userGradeNumber >= 64){
//                System.out.println("You have an D+");
//            }
//            else if(userGradeNumber < 64 && userGradeNumber >= 62){
//                System.out.println("You have an D");
//            }
//            else if(userGradeNumber < 62 && userGradeNumber >= 60){
//                System.out.println("You have an D-");
//            }
//            else if(userGradeNumber < 60){
//                System.out.println("Your grade range is a F");
//            }
//        }
//        else{
//            System.out.println("Goodbye! ('-')");
//        }



    }
}
