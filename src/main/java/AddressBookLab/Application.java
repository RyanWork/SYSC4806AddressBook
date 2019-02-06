package AddressBookLab;

import AddressBookLab.Model.AddressBook;
import AddressBookLab.Model.BuddyInfo;
import AddressBookLab.Repository.AddressBookRepository;
import AddressBookLab.Repository.BuddyInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
//        Launcher launcher = new Launcher();
//        launcher.launch();

        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            /*
            AddressBook ab = new AddressBook();
            BuddyInfo b1 = new BuddyInfo("Ryan", "100975926");
            BuddyInfo b2 = new BuddyInfo("Test", "123456");
            ab.AddBuddy(b1);
            ab.AddBuddy(b2);

            repository.save(b1);
            repository.save(b2);

            addressBookRepository.save(ab);

            log.info("All Buddy Infos");
            log.info("-------------------------------");
            for (BuddyInfo bi : repository.findAll()) {
                log.info(bi.toString());
            }
            log.info("");

            log.info("Find Buddy by name");
            log.info("-------------------------------");
            for (BuddyInfo bi : repository.findByName("Ryan")) {
                log.info(bi.toString());
            }
            log.info("");
            */
        };

        /*
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };*/
    }

}