package com.daitd.teaclothes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "ACCOUNT_ENTITY")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class Account  extends AuditMetadata{


    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID", nullable = false)
    private Long accountId;

    @Column(name = "USER_ID", nullable = false)
    private String userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPassword;

    @Column(name = "USER_TOKEN")
    private String userToken;

    @Column(name = "ACCOUNT_BACKUP_STRING")
    private String accountBackupString;

    @Column(name = "ACCOUNT_ROLE", nullable = false)
    private String accountRole;

}
