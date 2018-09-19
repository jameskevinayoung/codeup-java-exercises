import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner bobScanner = new Scanner(System.in);
        boolean confirm = true;
        while(confirm) {

            System.out.println("Say something to Bob. Make sure you use punctuation.");
            String speak = bobScanner.nextLine();
            if(speak.endsWith("?")) System.out.println("Sure.");
            else if(speak.endsWith("!")) System.out.println("Whoa, chill out!");
            else if(speak.contentEquals("")) System.out.println("Fine. Be that way!");
            else System.out.println("Whatever.");




            System.out.println("Do you want to continue? Y/N");
            String response = bobScanner.nextLine();
            if (!response.toLowerCase().equals("y")) confirm = false;
        }





    }
}
