package org.online_charity_website.charity_website.Repositories;

import org.online_charity_website.charity_website.Entities.NgoRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NgoRequestRepo extends JpaRepository<NgoRequest , Long>  {
    
}
