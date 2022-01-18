package org.online_charity_website.charity_website.Repositories;

import org.online_charity_website.charity_website.Entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepo extends JpaRepository<Donor,Long> {

    Donor findByuserEmail(String emailId);
    
}
