package com.br.vr.miniautorizador.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import com.br.vr.miniautorizador.service.AuthenticationService;

@RestController
public class AutheticationController {
    private final AuthenticationService authenticationService;

    public AutheticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String authenticate(Authentication authentication) {

        return authenticationService.authenticate(authentication);
    }

}