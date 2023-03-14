package com.globant.pichinchaapi.services.customer;

import com.globant.pichinchaapi.model.CustomerEntity;
import com.globant.pichinchaapi.model.CustomerResponse;

import java.util.UUID;

public interface CustomerService {

    CustomerEntity saveCustomer(CustomerEntity newCustomer);

    CustomerEntity updateCustomer(String idOldCustomer, CustomerEntity newCustomer);

    void deleteCustomer(String idCustomer);

    CustomerResponse findCustomerById(String idCustomer);
}
