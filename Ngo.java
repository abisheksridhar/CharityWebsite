package org.online_charity_website.charity_website.Entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@PrimaryKeyJoinColumn(name="ngoID")
public class Ngo extends User {
   
    @NotBlank
    private String ngoOrganisationName;

    @OneToMany(mappedBy = "ngo")
    private List<NgoRequest> ngoRequest;

    public Ngo(@NotBlank String userFirstName, String userLastName, @NotBlank @Email String userEmail,
            @NotBlank @Size(min = 8, message = "Password must atleast contain 8 character") String userPassword,
            @NotBlank String ngoOrganisationName) {
        super(userFirstName, userLastName, userEmail, userPassword);
        this.ngoOrganisationName = ngoOrganisationName;
    }

    public Ngo() {
        
    }

    public String getNgoOrganisationName() {
        return ngoOrganisationName;
    }

    public void setNgoOrganisationName(String ngoOrganisationName) {
        this.ngoOrganisationName = ngoOrganisationName;
    }
}
