package com.daitd.teaclothes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table (name = "USERS_ENTITY")
@NoArgsConstructor
@AllArgsConstructor
@Accessors (chain = true)
@Getter
@Setter
public class Users extends  AuditMetadata {


    @Id
    @Column(name = "USER_ID", nullable = false)
    private String userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_TYPE", nullable = false)
    private String userType;

    @Column(name = "USER_GENDER", nullable = false)
    private String userGender;

    @Column(name = "USER_DOB")
    private String userDob;

    @Column(name = "USER_ADDRESS")
    private String userAddress;

    @Column(name = "USER_TEL")
    private String userTel;

    @Column(name = "USER_EMAIL")
    private String userEmail;


}
