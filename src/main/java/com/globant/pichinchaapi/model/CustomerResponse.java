package com.globant.pichinchaapi.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerResponse {

    private String name;
    private EGender gender;
    private LocalDate dateOfBirth;
    private EDocumentType documentType;
    private Long documentNumber;
    private String address;
    private String phoneNumber;
    private ECustomerStatus customerStatus;

}
