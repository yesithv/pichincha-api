package com.globant.pichinchaapi.services.customer;

import com.globant.pichinchaapi.errors.CustomerNotFoundException;
import com.globant.pichinchaapi.model.CustomerEntity;
import com.globant.pichinchaapi.model.CustomerResponse;
import com.globant.pichinchaapi.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.globant.pichinchaapi.mapper.CustomerMapper.CUSTOMER_MAPPER;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerEntity saveCustomer(CustomerEntity newCustomer) {
        return customerRepository.save(newCustomer);
    }

    @Override
    public CustomerEntity updateCustomer(String idOldCustomer, CustomerEntity newCustomer) {

        CustomerEntity oldCustomer = customerRepository.findById(idOldCustomer)
                .orElseThrow(() -> new CustomerNotFoundException("EL cliente con el id [" + idOldCustomer + "] no existe"));

        return customerRepository.save(CUSTOMER_MAPPER.updateCustomer(oldCustomer, newCustomer));
    }

    @Override
    public void deleteCustomer(String idCustomer) {

        if (!customerRepository.existsById(idCustomer)) {
            log.error("El cliente con el id [{}}] no existe ", idCustomer);
            throw new CustomerNotFoundException("EL cliente con el id [" + idCustomer + "] no existe");
        }

        customerRepository.deleteById(idCustomer);
    }

    @Override
    public CustomerResponse findCustomerById(String idCustomer) {

        var optionalCustomer = customerRepository.findById(idCustomer);

        if (!optionalCustomer.isPresent()) {
            log.error("El cliente con el id [{}}] no existe ", idCustomer);
            throw new CustomerNotFoundException("EL cliente con el id [" + idCustomer + "] no existe");
        }

        return CUSTOMER_MAPPER.responseMapper(optionalCustomer.get());
    }

}
