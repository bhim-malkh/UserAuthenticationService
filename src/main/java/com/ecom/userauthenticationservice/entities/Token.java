package com.ecom.userauthenticationservice.entities;

import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Token {
    private String value;
    @ManyToOne
    private User user;
    private Date expiryAt;

}
