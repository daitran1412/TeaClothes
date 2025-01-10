package com.daitd.teaclothes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "CLOSET_ENTITY")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class Closet extends  AuditMetadata {


    @Id
    @GeneratedValue
    @Column(name = "CLOSET_ID", nullable = false)
    private Long closetId;

    @Column(name = "CLOSET_NAME")
    private String closetName;

    @Column(name = "CLOSET_TYPE", nullable = false)
    private String closetType;

    @Column(name = "CLOSET_SLOT", nullable = false)
    private String closetSlot;

    @Column(name = "CLOTHE_ID", nullable = false)
    private String clotheId;

    @Column (name = "USER_ID", nullable = false)
    private String userId;


}
