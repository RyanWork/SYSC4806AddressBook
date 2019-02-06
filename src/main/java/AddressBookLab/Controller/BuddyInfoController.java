package AddressBookLab.Controller;

import AddressBookLab.Model.BuddyInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BuddyInfoController {
    private final AtomicLong counter = new AtomicLong();

    /**
     * Create a buddy info object
     * @param name  name of the buddy
     * @param phoneNumber   phone number of the buddy
     * @return  the newly created buddy info
     */
    @RequestMapping("/buddyinfo")
    public BuddyInfo buddyInfo(@RequestParam(value="name") String name,
                               @RequestParam(value="phoneNumber") String phoneNumber){
        return new BuddyInfo(name, phoneNumber);
    }
}
