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


}
