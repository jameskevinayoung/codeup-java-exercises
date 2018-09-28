package Contacts;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.File;



public class ContactsManagerApplicaton extends Contacts {
    public static Scanner contactScanner = new Scanner (System.in);



    public static void main(String[] args) {
        Path ContactsDirectory = Path.get("./contactsDirectory");

        Path contacts = Paths.get("./contactsDirectory", "contacts.txt");
        List<String> contactLine;

        try{
            if(Files.notExists(ContactsDirectory)) {
                Files.createDirectory(ContactsDirectory);
            }if(Files.exists(contacts)){
                contactLine = Files.readAllLines(contacts);
                for(String line:contactLine) System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println(ContactsDirectory.toAbsolutePath());



        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        int userMainMenu = contactScanner.nextInt();


        try{

            if(userMainMenu < 1 || userMainMenu > 5){
                System.out.println();
            }
        }




    }


}
