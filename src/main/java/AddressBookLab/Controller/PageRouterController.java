package AddressBookLab.Controller;

import AddressBookLab.Model.AddressBook;
import AddressBookLab.Services.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageRouterController {
    @Autowired
    AddressBookService abs;

    @RequestMapping("/")
    @ResponseBody
    public String greeting() {
        return "Hello World";
    }

    @RequestMapping(value="addressbook/{id}", method = RequestMethod.GET)
    public String routeAddressBook(@PathVariable(value="id") int id, Model model){
        AddressBook ab = abs.getAddressBookById(id);
        model.addAttribute("addressbook", ab);
        return "addressbook";
    }
}
