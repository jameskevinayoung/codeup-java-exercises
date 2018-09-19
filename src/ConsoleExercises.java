//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args){

//      EXERCISES PART 1
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s.\n", pi);

//      EXERCISES PART 2.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int numberInput = scanner.nextInt();
        System.out.println(numberInput);

//      EXERCISE PART 2.2

        System.out.println("Please enter 3 words");
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
//        System.out.format("%s%n%s%n%s%n", s1,s2,s3);

//If you user doesn't input 3 words Java will wait until 3 words have been written.
//if user puts in more than 3 words Java will just take the first 3 words.

//      EXERCISE PART 2.3 and 2.4

        System.out.println("Tell me your favorite quote");
        String favoriteQuote = scanner.nextLine();
        System.out.format("Your favorite quote is, %s\n", favoriteQuote);
//Using nextLine you get back the entire line


//      EXERCISE PART 3.1

        System.out.println("What's the length of the classroom?");
        String classLengthInFeet = scanner.nextLine();
        int classLength = Integer.parseInt(classLengthInFeet);
        System.out.println(classLength + " feet");
        System.out.println("What's the width of the classroom?");
        String classWidthInFeet = scanner.nextLine();
        int classWidth =Integer.parseInt(classWidthInFeet);
        System.out.println(classWidth + " feet");
        System.out.format("The room is %sft x %sft\n", classLength,classWidth);


//      EXERCISE PART 3.2
        System.out.println("The area is " + (classLength * classWidth) +" feet");
        System.out.println("The perimeter is " + ((2*classLength) + (2*classWidth)) + " feet");

//      EXERCISE PART 3.3




    }
}
