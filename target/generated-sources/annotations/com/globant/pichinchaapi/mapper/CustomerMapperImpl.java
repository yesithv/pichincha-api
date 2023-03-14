package com.globant.pichinchaapi.mapper;

import com.globant.pichinchaapi.model.CustomerEntity;
import com.globant.pichinchaapi.model.CustomerResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T17:35:21-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerResponse responseMapper(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setName( customerEntity.getName() );
        customerResponse.setGender( customerEntity.getGender() );
        customerResponse.setDateOfBirth( customerEntity.getDateOfBirth() );
        customerResponse.setDocumentType( customerEntity.getDocumentType() );
        customerResponse.setDocumentNumber( customerEntity.getDocumentNumber() );
        customerResponse.setAddress( customerEntity.getAddress() );
        customerResponse.setPhoneNumber( customerEntity.getPhoneNumber() );
        customerResponse.setCustomerStatus( customerEntity.getCustomerStatus() );

        return customerResponse;
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity oldCustomer, CustomerEntity newCostumer) {
        if ( oldCustomer == null && newCostumer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        if ( oldCustomer != null ) {
            customerEntity.setIdPerson( oldCustomer.getIdPerson() );
            customerEntity.setIdCustomer( oldCustomer.getIdCustomer() );
        }
        if ( newCostumer != null ) {
            customerEntity.setName( newCostumer.getName() );
            customerEntity.setGender( newCostumer.getGender() );
            customerEntity.setDateOfBirth( newCostumer.getDateOfBirth() );
            customerEntity.setDocumentType( newCostumer.getDocumentType() );
            customerEntity.setDocumentNumber( newCostumer.getDocumentNumber() );
            customerEntity.setAddress( newCostumer.getAddress() );
            customerEntity.setPhoneNumber( newCostumer.getPhoneNumber() );
            customerEntity.setPassword( newCostumer.getPassword() );
            customerEntity.setCustomerStatus( newCostumer.getCustomerStatus() );
        }

        return customerEntity;
    }
}
