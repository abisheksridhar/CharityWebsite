package org.online_charity_website.charity_website.Controller;

import javax.validation.Valid;

import org.online_charity_website.charity_website.Entities.Donor;
import org.online_charity_website.charity_website.Services.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class DonorController {
    
    @Autowired
    private DonorService donorService;

    @PostMapping("/donor/create")
    public Donor createDonor(@Valid @RequestBody Donor donor)
    {
        return donorService.createDonor(donor);
    }

    @PostMapping("/donor/update/{email}")
    public Donor updateDonor(@PathVariable("email") String emailId,@Valid @RequestBody  Donor Donor)
    {
        return donorService.updateDonor(emailId, Donor);
        
    }

    @RequestMapping(value ="/donor/verifyUser/{email}/{password}/",method = RequestMethod.POST)
    public boolean verifyDonor(@PathVariable("email")String email,
                                @PathVariable("password") String password)
    {
            return donorService.verifyDonor(email,password);
    }

    @DeleteMapping("/ngo/deleteUser/{id}")
    public String deleteRequest(@PathVariable("id") Long id)
    {
        String result;
        result = donorService.deleteRequest(id);
        return result;
    }
}
