package com.ecom.userauthenticationservice.services;

import com.ecom.userauthenticationservice.dtos.LoginRequestDTO;
import com.ecom.userauthenticationservice.dtos.SignUpRequestDTO;
import com.ecom.userauthenticationservice.dtos.UserDTO;
import com.ecom.userauthenticationservice.entities.Token;
import com.ecom.userauthenticationservice.entities.User;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserAuthenticationService {


    public User signUp(String username, String email, String password){

        return null;
    }


    public Token login( LoginRequestDTO loginRequestDTO){
        return null;
    }


    public void logout( String token){}


    public UserDTO validate(String token){
        return null;
    }
}
