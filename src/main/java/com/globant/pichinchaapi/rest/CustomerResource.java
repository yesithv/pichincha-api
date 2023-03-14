package com.globant.pichinchaapi.rest;

import com.globant.pichinchaapi.model.CustomerEntity;
import com.globant.pichinchaapi.model.CustomerResponse;
import com.globant.pichinchaapi.services.customer.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pichincha-api/v1/customers")
@AllArgsConstructor
public class CustomerResource {

    private final CustomerService customerService;

    @PostMapping()
    public CustomerEntity create(@RequestBody CustomerEntity customerEntity) {
        return customerService.saveCustomer(customerEntity);
    }

    @GetMapping("/{idCustomer}")
    public CustomerResponse show(@PathVariable String idCustomer) {
        return customerService.findCustomerById(idCustomer);
    }

    @PutMapping("/{idCustomer}")
    public CustomerEntity update(@PathVariable String idCustomer, @RequestBody CustomerEntity newCustomer) {
        return customerService.updateCustomer(idCustomer, newCustomer);
    }

    @DeleteMapping("/{idCustomer}")
    public void delete(@PathVariable String idCustomer) {
        customerService.deleteCustomer(idCustomer);
    }

}
