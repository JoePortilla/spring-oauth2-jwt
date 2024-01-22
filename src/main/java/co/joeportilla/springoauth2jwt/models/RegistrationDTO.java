package co.joeportilla.springoauth2jwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {
    private String username;
    private String password;

    public String toString() {
        return "Registration info: username: " + this.username + " password: " + this.password;
    }
}
