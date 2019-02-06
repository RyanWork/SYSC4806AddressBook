package AddressBookLab.Repository;

import java.util.List;

import AddressBookLab.Model.BuddyInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long> {
    List<BuddyInfo> findById(int Id);

    List<BuddyInfo> findByName(String name);

    List<BuddyInfo> findByPhoneNumber(String phoneNumber);
}