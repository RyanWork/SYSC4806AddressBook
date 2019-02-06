package AddressBookLab.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class BuddyInfo {
    /**
     * Unique Identifier for the buddy
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    /**
     * Name of the buddy
     */
    private String name;

    /**
     * Phone number of the buddy
     */
    private String phoneNumber;

    /**
     * Default Constructor
     */
    public BuddyInfo(){
        this.name = "";
        this.phoneNumber = "";
    }

    /**
     * Constructor to initialize a buddy
     * @param name  The name to set the buddy to
     * @param phoneNumber   The phone number to set
     */
    public BuddyInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " Phone Number: " + this.getPhoneNumber();
    }

    /*
    public AddressBook getAddressBook(){
        return this.ab;
    }

    public void setAddressBook(AddressBook ab){
        this.ab = ab;
    }*/
}
