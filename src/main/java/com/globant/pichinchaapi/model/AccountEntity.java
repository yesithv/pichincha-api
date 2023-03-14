package com.globant.pichinchaapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.UUID;

@Table(name = "accounts")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountEntity implements Serializable {

    @Id
    @Column(updatable = false)
    private String idAccount;

    @Column
    private ECompany company;

    @Column
    private Long accountNumber;

    @Column
    private EAccountType accountType;

    @Column
    private Float initialBalance;

    @Column
    private Float balance;

    @Column
    private EAccountStatus accountStatus;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idCustomer", name = "fk_customer")
    private CustomerEntity customerEntity;

}
