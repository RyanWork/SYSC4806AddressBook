package AddressBookLab.Controller;

import AddressBookLab.Model.AddressBook;
import AddressBookLab.Model.BuddyInfo;
import AddressBookLab.Repository.AddressBookRepository;
import AddressBookLab.Services.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AddressBookController {
    /**
     * Counter for address books
     */
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    AddressBookService abs;

    /**
     * Mapping for addressbook
     * @return return addressbook
     */
    @RequestMapping("/addressbook")
    public AddressBook addressBook(){
        AddressBook ab = new AddressBook();
        ab.setId((int)counter.incrementAndGet());

        this.abs.addNewAddressBook(ab);
        return ab;
    }

    @RequestMapping("/addressbook/all")
    public List<AddressBook> getAllAddressBooks(){
        return abs.getAllAddressBooks();
    }

    @RequestMapping(value="/addressbook", method = RequestMethod.POST)
    public AddressBook addBuddy(@RequestParam(value="id") int id,
                           @RequestParam(value="name") String name,
                           @RequestParam(value="phoneNumber") String phoneNumber){

        BuddyInfo bi = new BuddyInfo(name, phoneNumber);
        return abs.saveNewBuddy(id, bi);
    }

    @RequestMapping(value="/addressbook", method = RequestMethod.DELETE)
    public AddressBook removeBuddy(@RequestParam(value="id") int id,
                                   @RequestParam(value="name") String name,
                                   @RequestParam(value="phoneNumber") String phoneNumber) {

        return abs.removeBuddy(id, name, phoneNumber);
    }
}
