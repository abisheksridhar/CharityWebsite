package org.online_charity_website.charity_website.Services;

import org.online_charity_website.charity_website.Entities.Ngo;

public interface NgoService {

    public Ngo createNgo(Ngo ngo);

    public Ngo updateNgo(String emailId, Ngo ngo);

    public boolean verifyNgo(String email, String password);
    
}
