package com.process.shoppingstore.model;


import lombok.*;

import java.util.Date;

@Data
public class User {

    private String userFullName;

    private Date userbirthDate;

    private String userIdentificationType;

    private String userIdentification;

    private String userPhoneNumber;

    private String userEmail;

    private String userPassword;

    private String userAddress;




}
