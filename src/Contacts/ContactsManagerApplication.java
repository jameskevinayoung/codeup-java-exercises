package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class ContactsManagerApplication {
//    public static Scanner contactScanner = new Scanner (System.in);

    private static void  displayContact(String filter){ //this is a method to display the movie options by category;
        Contact[] all = ContactsArray.findAll();//create a variable for a movie array and assign the Movies array findAll method to it.
        if(filter.equals("View"))//if the user selects 1 then display all the movies
            for(Contact contact: all) System.out.println(contact.getContactName()+ ":"+contact.getContactAddress()+", "+
                    contact.getContactEmail()+", "+contact.getContactType()+", "+ contact.getContactPhoneNumber());//loop through each movie and print out the name and category
        else{
            for(Contact contact: all){
//otherwise loop through each movie and if the movie category equals the user's selection print out the movies' name and category associated with the selection;
                if(contact.getContactName().equals(filter))System.out.println(contact.getContactName()+ ":"+contact.getContactAddress()+", "+
                        contact.getContactEmail()+", "+contact.getContactType()+", "+ contact.getContactPhoneNumber());
            }
        }
    }


    public static void main(String[] args) {

//       Contact newContact = new Contact("Jakai Alexis","1234 Sudo Lane",
//               "jakaiBAlexis@jumba.com","Personal",5152346789L);



//        Path ContactsDirectory = Paths.get("./contactsDirectory");
//
//        Path contacts = Paths.get("./contactsDirectory", "contacts.txt");
//        List<String> contactLine = new ArrayList<>();
//
//        try{
//            if(Files.notExists(ContactsDirectory)) {//was able to make the directory
//                Files.createDirectory(ContactsDirectory);
//            }if(Files.notExists(contacts)){
//                contactLine = Files.readAllLines(contacts);
//                for(String line:contactLine) System.out.println(line);
//            }
//        }catch(IOException e){
//            System.out.println(e);
//        }
//        System.out.println(ContactsDirectory.toAbsolutePath());


        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.");


        Contact[] newContactArray = ContactsArray.findAll();
        Scanner contactScanner = new Scanner (System.in);


        while(true){

            System.out.println("Enter an option (1, 2, 3, 4 or 5):");

            String userMenuInput = contactScanner.nextLine();

            switch(userMenuInput){
                case("1"):
                    displayContact("View contacts");break;
                case("2"):
                    displayContact("Add a new contact");break;
                case("3"):
                    displayContact("Search a contact by name");break;
                case("4"):
                    displayContact("Delete an existing contact");break;
                case("5"):
                    return;
            }

        }




    }


}
