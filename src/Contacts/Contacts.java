package Contacts;

import java.io.IOException;
import  java.nio.file.Paths;
import  java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class Contacts {

    private String contactName;
    private String contactAddress;
    private String contactEmail;
    private String contactType;
    private int contactPhoneNumber;

    public Contacts(String name, String address, String email, String contactType, int phoneNumber) {
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

    public int getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }


}
