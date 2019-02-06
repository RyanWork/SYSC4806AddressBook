package AddressBookLab.Repository;

import java.util.List;

import AddressBookLab.Model.AddressBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addressbooks", path = "addressbookmodel")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
    List<AddressBook> findById(int Id);
}