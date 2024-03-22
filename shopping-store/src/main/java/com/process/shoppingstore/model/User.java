package com.process.shoppingstore.model;


import com.process.shoppingstore.model.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "user_full_name")
    private String userFullName;

    @Column(name = "user_birth_date", nullable = false)
    private LocalDate userBirthDate;

    @Column(name = "user_identification_type", nullable = false)
    private DocumentType userIdentificationType;

    @Column(name = "user_identification")
    private String userIdentification;

    @Column(name = "user_phone_number")
    private String userPhoneNumber;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

//    @Column(name = "user_address")
//    private List<Address> userAddress;




}
