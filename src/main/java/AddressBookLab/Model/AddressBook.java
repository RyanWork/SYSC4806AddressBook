package AddressBookLab.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class AddressBook {
    /**
     * The unique identifier for this address book
     */
    @Id
    @GeneratedValue
    public int id;

    /**
     * List of buddies for this AddressBookLab.Model.AddressBook
     */
    @OneToMany(cascade={CascadeType.ALL})
    public Collection<BuddyInfo> buddyList;

    /**
     * Initial Constructor
     */
    public AddressBook(){
        this.buddyList = new ArrayList<BuddyInfo>();
    }

    /**
     * Add a buddy to the AddressBookLab.Model.AddressBook
     * @param buddy the buddy to add
     */
    public void AddBuddy(BuddyInfo buddy){
        this.buddyList.add(buddy);
    }

    /**
     * Remove a buddy from the AddressBookLab.Model.AddressBook
     * @param buddy the buddy to remove
     */
    public void RemoveBuddy(BuddyInfo buddy){
        this.buddyList.remove(buddy);
    }

    /**
     * Get a buddy at a particular index
     * @param index the 0-based index of the buddy
     * @return the buddy at the index
     */
    public BuddyInfo getBuddy(int index){
        return (BuddyInfo)this.buddyList.toArray()[index];
    }

    /**
     * Convert the contents of the address book into a JSON string
     * @return a string containing all the buddies
     */
    public String toString(){
        StringBuilder content = new StringBuilder();
        content.append("[");

        // Append all buddies as a JSON formatted string
        for(BuddyInfo b : this.buddyList){
            content.append("{\"name\":\"" + b.getName() + "\",");
            content.append("\"phoneNumber\":\"" + b.getPhoneNumber() + "\"" + "},");
        }

        // Remove the last comma
        content.deleteCharAt(content.length() - 1);
        content.append("]");

        return content.toString();
    }

    /**
     * Getter for the id
     * @return
     */
    public int getId(){
        return this.id;
    }

    /**
     * Set the id for this address book
     * @param Id    the id to set it to
     */
    public void setId(int Id){
        this.id = Id;
    }

    /**
     * Get the buddy list as an array list object
     * @return the array list of buddy infos
     */
    public Collection<BuddyInfo> getBuddyList() {
        return buddyList;
    }

    /**
     * Set the buddy list
     * @param buddyList The list of buddies
     */
    public void setBuddyList(Collection<BuddyInfo> buddyList){
        this.buddyList = (ArrayList)buddyList;
    }

    /**
    public static void main(String args[]){
        /* Old main code
        // Create the address book
        AddressBookLab.Model.AddressBook ab = new AddressBookLab.Model.AddressBook();

        // Create the buddies
        AddressBookLab.Model.BuddyInfo b1 = new AddressBookLab.Model.BuddyInfo("name1", "num1");
        AddressBookLab.Model.BuddyInfo b2 = new AddressBookLab.Model.BuddyInfo("name2", "num2");
        AddressBookLab.Model.BuddyInfo b3 = new AddressBookLab.Model.BuddyInfo("name3", "num3");

        // Add all the buddies to the address book
        ab.AddBuddy(b1);
        ab.AddBuddy(b2);
        ab.AddBuddy(b3);

        // Print the contents of the address book
        System.out.println(ab.toString());



        Launcher launcher = new Launcher();
        launcher.launch();
    }*/
}
