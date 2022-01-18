package org.online_charity_website.charity_website.Controller;


import javax.validation.Valid;

import org.online_charity_website.charity_website.Entities.Ngo;
import org.online_charity_website.charity_website.Services.NgoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NgoController {

    @Autowired
    private NgoService ngoService;

    @PostMapping("/ngo/create")
    public Ngo createNgo(@Valid @RequestBody Ngo ngo)
    {
        return ngoService.createNgo(ngo);
    }

    @PostMapping("/ngo/update/{email}")
    public Ngo updateNgo(@PathVariable("email") String emailId,@Valid @RequestBody  Ngo ngo)
    {
        return ngoService.updateNgo(emailId, ngo);
        
    }

    @RequestMapping(value ="/ngo/verifyUser/{email}/{password}/",method = RequestMethod.POST)
    public boolean verifyNgo(@PathVariable("email")String email,
                                @PathVariable("password") String password)
    {
            return ngoService.verifyNgo(email,password);
    }
    @DeleteMapping("/ngo/deleteUser/{id}")
    public String deleteRequest(@PathVariable("id") Long id)
    {
        String result;
        result = ngoService.deleteRequest(id);
        return result;
    }

    
}
