package com.globant.pichinchaapi.mapper;

import com.globant.pichinchaapi.model.CustomerEntity;
import com.globant.pichinchaapi.model.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper CUSTOMER_MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerResponse responseMapper(CustomerEntity customerEntity);

    @Mapping(target = "idPerson", source = "oldCustomer.idPerson")
    @Mapping(target = "name", source = "newCostumer.name")
    @Mapping(target = "gender", source = "newCostumer.gender")
    @Mapping(target = "dateOfBirth", source = "newCostumer.dateOfBirth")
    @Mapping(target = "documentType", source = "newCostumer.documentType")
    @Mapping(target = "documentNumber", source = "newCostumer.documentNumber")
    @Mapping(target = "address", source = "newCostumer.address")
    @Mapping(target = "phoneNumber", source = "newCostumer.phoneNumber")
    @Mapping(target = "idCustomer", source = "oldCustomer.idCustomer")
    @Mapping(target = "password", source = "newCostumer.password")
    @Mapping(target = "customerStatus", source = "newCostumer.customerStatus")
    CustomerEntity updateCustomer(CustomerEntity oldCustomer, CustomerEntity newCostumer);
}
