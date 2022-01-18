package org.online_charity_website.charity_website.Services;

import org.online_charity_website.charity_website.Entities.Ngo;
import org.online_charity_website.charity_website.Repositories.NgoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NgoServiceImplementation implements NgoService {
    @Autowired
    private NgoRepo ngoRepo;

    @Override
    public Ngo createNgo(Ngo ngo) {
        
        return ngoRepo.save(ngo);
    }
    @Override
    public Ngo updateNgo(String emailId,Ngo ngo) {
       Ngo NGO = ngoRepo.findByuserEmail(emailId);
       
            NGO.setUserFirstName(ngo.getUserFirstName());
        
       
            NGO.setUserLastName(ngo.getUserLastName());
        
        
            NGO.setUserPassword(ngo.getUserPassword());
        
        
            NGO.setNgoOrganisationName(ngo.getNgoOrganisationName());
      

       return ngoRepo.save(NGO);
    }
    @Override
    public boolean verifyNgo(String email, String password) {
        Ngo NGO = ngoRepo.findByuserEmail(email);

        if(NGO.getUserPassword().equalsIgnoreCase(password))
        {
            return true;
        }
        else
        return false;
    }
    public String deleteRequest(Long id) {
        ngoRepo.deleteById(id);
        return "Successfull";
    }


    
}
