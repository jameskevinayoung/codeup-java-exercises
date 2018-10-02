package Contacts;


public class Contact {

    private String contactName;
    private String contactAddress;
    private String contactEmail;
    private String contactType;
    private long contactPhoneNumber;




    public Contact (String name, String address, String email, String contactType, long phoneNumber) {
        this.contactName = name;
        this.contactAddress = address;
        this.contactEmail = email;
        this.contactType = contactType;
        this.contactPhoneNumber = phoneNumber;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContactType() {
        return this.contactType;
    }

    public long getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }


    public Contact[] addContact(Contact[] contacts, String name, String address, String email, String contactType, long phoneNumber ){ //Step 1: we are taking in the original array and adding a contact to an array of contacts
        //Step 4.b: we need to add in all of the parameters from the constructor inorder to build a new contact inside this method;



        Contact[] updatedContact = new Contact[contacts.length +1];//Step 2: take the existing contact array and assigning it to a variable that is
        //one space larger than the previous contacts array.

        //Step 3: to keep the contents of the old array we have to loop through the array and add it to the updated contacts

        for(int i = 0; i< contacts.length; i++) {

            //Step 4.a: in the updatedContact array, the index of i is assigned the passed contact array value at the same index;
            //this handles the old contacts;
            updatedContact[i] = contacts[i];
        }

        // Step 5.a: after we loop through the entire old array we have to add another spot to the new array;
        //we are going to have to use the same values in the constructor to form a new contact in this method;
        //these items represent the parameters for building our new contact array
        Contact newContact = new Contact(name, address, email,contactType, phoneNumber);

        //Step 5.b: newContact needs to be at the last index of our array;
        //to do that we take our updatedContact array and find the length of that array and subtract 1 to get the last index position;
        /**
         * example: the length of the original array is 3 (3 contacts in the array) but the index is 2 (0, 1, 2);
         * we added an additional space to the updatedContact array (orginal array's length +1) which gives us an index of 3 (0, 1, 2, 3;
         * now take the updated array's length (which is 4) and subtract by 1;
         * this will give the index position 3 to our updatedContact;
         * now we assign that position to the newContact.
         */

        updatedContact[updatedContact.length-1]=newContact;


        //step 6: return the updatedContact array;

        return updatedContact;
    }

}
