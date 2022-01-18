package org.online_charity_website.charity_website.Services;

import org.online_charity_website.charity_website.Entities.Donor;
import org.online_charity_website.charity_website.Repositories.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorServiceImplementation implements DonorService {

   @Autowired
   private DonorRepo dRepo;

   @Override
   public Donor createDonor(Donor donor) {
      
       return dRepo.save(donor);
   }

   @Override
   public Donor updateDonor(String emailId, Donor donor) {

      Donor DONOR = dRepo.findByuserEmail(emailId);
       
            DONOR.setUserFirstName(donor.getUserFirstName());
        
       
            DONOR.setUserLastName(donor.getUserLastName());
        
        
            DONOR.setUserPassword(donor.getUserPassword());
        
        
            DONOR.setDonorTrustName(donor.getDonorTrustName());
      

       return dRepo.save(DONOR);
     
   }

   @Override
   public boolean verifyDonor(String email, String password) {
      
      Donor DONOR = dRepo.findByuserEmail(email);

      if(DONOR.getUserPassword().equalsIgnoreCase(password))
      {
          return true;
      }
      else
      return false;
  }

    @Override
     public String deleteRequest(Long id) {
             dRepo.deleteById(id);
            return "Successfull";
        }
   
    
}
