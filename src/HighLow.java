import java.util.Scanner;
public class HighLow {

    static Scanner highLowScan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        highLowGame();
    }

    public static void highLowGame() {
        int randomNumber = (int) (Math.ceil(Math.random() * 1000));

        int userGuess;

        do {

            System.out.println("Guess between 1 and 1000");
            userGuess = getInt(1, 1000);

            if(userGuess < randomNumber) {
                System.out.println("Number was too low. PICK HIGHER!");
            } else if(userGuess > randomNumber) {
                System.out.println("Number was too high. PICK LOWER!!");
            }

        } while(userGuess != randomNumber);

        System.out.println("You got it right!");


        System.out.println("Do you want to play again? Y/N!");
        String userAnswer = highLowScan.next();
        if(userAnswer.equals("y")) {
            highLowGame();
        } else {

            System.out.println("Good Bye.");
        }

    }

    public static int getInt(int min, int max) {

        int userInt = highLowScan.nextInt();
        if(userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Your number has to be between " + min + " and " + max);
            return getInt(min, max);
        }
    }


}

