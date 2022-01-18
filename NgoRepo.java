package org.online_charity_website.charity_website.Repositories;

import org.online_charity_website.charity_website.Entities.Ngo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NgoRepo extends JpaRepository<Ngo , Long> {

    Ngo findByuserEmail(String emailId);
    
}
