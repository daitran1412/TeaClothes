package com.daitd.teaclothes.model.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;


@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors (chain = true)
public abstract class AuditMetadata  {

    private Date createDate;
    private Date modifyDate;
    private String createUser;
    private String modifyUser;
    private String recordStatus;

}
