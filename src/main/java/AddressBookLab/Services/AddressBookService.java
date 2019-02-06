package AddressBookLab.Services;

import AddressBookLab.Model.AddressBook;
import AddressBookLab.Model.BuddyInfo;
import AddressBookLab.Repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AddressBookService {
    private AddressBookRepository abr;

    @Autowired
    public AddressBookService(AddressBookRepository abr) {
        this.abr = abr;
    }

    public void addNewAddressBook(AddressBook ab){
        this.abr.save(ab);
    }

    public AddressBook saveNewBuddy(int id, BuddyInfo bi){
        AddressBook ab = this.getAddressBookById(id);
        ab.AddBuddy(bi);
        this.abr.save(ab);

        return ab;
    }

    public List<AddressBook> getAllAddressBooks(){
        List<AddressBook> List = new ArrayList<AddressBook>();
        for(AddressBook ab : abr.findAll()){
            List.add(ab);
        }

        return List;
    }

    public AddressBook getAddressBookById(int id){
        return abr.findById(id).get(0);
    }

    public AddressBook removeBuddy(int id, String name, String phoneNumber){
        AddressBook ab = this.getAddressBookById(id);
        Collection<BuddyInfo> listBI = ab.getBuddyList();
        ArrayList<BuddyInfo> arrayListBI = new ArrayList<BuddyInfo>(listBI);

        for(int i = 0; i < arrayListBI.size(); i++){
            if(arrayListBI.get(i).getName().equals(name) && arrayListBI.get(i).getPhoneNumber().equals(phoneNumber)) {
                listBI.remove(arrayListBI.get(i));
                break;
            }
        }

        abr.save(ab);
        return ab;
    }
}
