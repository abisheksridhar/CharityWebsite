package org.online_charity_website.charity_website.Services;

import org.online_charity_website.charity_website.Entities.Donor;

public interface DonorService {

    Donor createDonor(Donor donor);

    Donor updateDonor(String emailId, Donor donor);

    boolean verifyDonor(String email, String password);
    
}
