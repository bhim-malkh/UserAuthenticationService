package com.ecom.userauthenticationservice.controllers;

import com.ecom.userauthenticationservice.dtos.LoginRequestDTO;
import com.ecom.userauthenticationservice.dtos.SignUpRequestDTO;
import com.ecom.userauthenticationservice.dtos.UserDTO;
import com.ecom.userauthenticationservice.entities.Token;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserAuthenticationController {

    @PostMapping("/signup")
    public UserDTO signUp(@RequestBody SignUpRequestDTO signUpDTO){
        return null;
    }

    @PostMapping("/login")
    public Token login(@RequestBody LoginRequestDTO loginRequestDTO){
        return null;
    }

    @PostMapping("/logout")
    public void logout(@RequestBody String token){}

    @PostMapping("validate/{token}")
    public UserDTO validate(@PathVariable("token") @NonNull String token){
        return null;
    }

}
