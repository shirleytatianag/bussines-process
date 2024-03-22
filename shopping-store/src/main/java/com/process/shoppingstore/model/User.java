package com.process.shoppingstore.model;


import com.process.shoppingstore.model.enums.DocumentType;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {

    private String userFullName;

    private Date userbirthDate;

    private DocumentType userIdentificationType;

    private String userIdentification;

    private String userPhoneNumber;

    private String userEmail;

    private String userPassword;

    private List<Address> userAddress;




}
