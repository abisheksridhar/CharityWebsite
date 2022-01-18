package org.online_charity_website.charity_website.Entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn(name="donorId")
public class Donor extends User {

    private String donorTrustName;

    public Donor() {
        super();
    }

    public Donor(@NotBlank String userFirstName, String userLastName, @NotBlank @Email String userEmail,
            @NotBlank @Size(min = 8, message = "Password must atleast contain 8 character") String userPassword,
            String donorTrustName) {
        super(userFirstName, userLastName, userEmail, userPassword);
        this.donorTrustName = donorTrustName;
    }

    public String getDonorTrustName() {
        return donorTrustName;
    }

    public void setDonorTrustName(String donorTrustName) {
        this.donorTrustName = donorTrustName;
    }
    
}
