package co.joeportilla.springoauth2jwt.controllers;

import co.joeportilla.springoauth2jwt.models.ApplicationUser;
import co.joeportilla.springoauth2jwt.models.LoginResponseDTO;
import co.joeportilla.springoauth2jwt.models.RegistrationDTO;
import co.joeportilla.springoauth2jwt.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) {
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}
