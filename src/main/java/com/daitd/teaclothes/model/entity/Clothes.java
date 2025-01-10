package com.daitd.teaclothes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table (name = "CLOTHES_ENTITY")
@NoArgsConstructor
@AllArgsConstructor
@Accessors (chain = true)
@Getter
@Setter
public class Clothes extends AuditMetadata {


    @Id
    @GeneratedValue
    @Column(name = "CLOTH_ID", nullable = false)
    private Long clothId;

    @Column (name = "USER_ID", nullable = false)
    private String userId;

    @Column (name = "GROUP_ID")
    private String groupId;

    @Column (name = "CLOTH_NAME", nullable = false)
    private String clothName;

    @Column (name = "CLOTH_TYPE", nullable = false)
    private String clothType;

    @Column (name = "CLOTH_GENDER")
    private String clothGender;

    @Column (name = "CLOTH_MATERIAL")
    private String clothMaterial;

    @Column (name = "CLOTH_DESCRIPTION")
    private String clothDescription;


}
