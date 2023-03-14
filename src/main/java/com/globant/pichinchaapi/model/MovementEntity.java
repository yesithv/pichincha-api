package com.globant.pichinchaapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Table(name = "movements")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovementEntity implements Serializable {

    /*@Id
    @GeneratedValue(strategy = GenerationType.UUID, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")*/

    @PrePersist
    private void setUpCustomer() {
        idMovement = UUID.randomUUID().toString();
    }

    @Id
    @Column(updatable = false)
    private String idMovement;

    @Column
    private LocalDate date;

    @Column
    private EMovementType movementType;

    @Column
    private Float value;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idAccount", name = "fk_account")
    private AccountEntity accountEntity;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idCustomer", name = "fk_customer")
    private CustomerEntity customerEntity;
}
