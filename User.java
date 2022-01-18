package org.online_charity_website.charity_website.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(
    name = "registered_user",
    uniqueConstraints = @UniqueConstraint(
        name = "Unique_Email",
        columnNames = "userEmail"
    )
)
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @SequenceGenerator(
        name = "userIdGenerator",
        sequenceName = "userIdGenerator",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "userIdGenerator"
    )
    private long userId;

    @NotBlank
    @Size(min = 3, message = "Name must atleast contain 3 character")
    private String userFirstName;

    private String userLastName;

    @NotBlank
    @Email
    private String userEmail;

    @NotBlank
    @Size(min = 8, message = "Password must atleast contain 8 character")
    private String userPassword;

    public User() {
        super();
    }

    public User(@NotBlank String userFirstName, String userLastName, @NotBlank @Email String userEmail,
            @NotBlank @Size(min = 8, message = "Password must atleast contain 8 character") String userPassword) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User [userEmail=" + userEmail + ", userFirstName=" + userFirstName + ", userId=" + userId
                + ", userLastName=" + userLastName + ", userPassword=" + userPassword + "]";
    }


    

    
    
}
