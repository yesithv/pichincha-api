package com.globant.pichinchaapi.repository;

import com.globant.pichinchaapi.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

}
