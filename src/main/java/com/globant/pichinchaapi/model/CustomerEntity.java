package com.globant.pichinchaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


@Table(name = "customers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerEntity extends Person implements Serializable {

    @PrePersist
    private void setUpCustomer() {
        setIdPerson(UUID.randomUUID().toString());
        idCustomer = UUID.randomUUID().toString();
    }

    @Id
    @Column(updatable = false)
    private String idCustomer;

    @Column
    private String password;

    @Column
    private ECustomerStatus customerStatus;

    //@OneToMany
    //private List<AccountEntity> customerAccounts;

}
