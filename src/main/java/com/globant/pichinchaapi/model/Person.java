package com.globant.pichinchaapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {

    @Column(updatable = false)
    private String idPerson;

    @Column
    private String name;

    @Column
    private EGender gender;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private EDocumentType documentType;

    @Column
    private Long documentNumber;

    @Column
    private String address;

    @Column
    private String phoneNumber;

}