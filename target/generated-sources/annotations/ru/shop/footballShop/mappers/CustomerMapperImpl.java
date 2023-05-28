package ru.shop.footballShop.mappers;

import javax.annotation.processing.Generated;
import ru.shop.footballShop.dto.CustomerDTO;
import ru.shop.footballShop.entites.Customer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-27T22:07:42+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO convertCustomerToCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setName( customer.getName() );
        customerDTO.setEmail( customer.getEmail() );

        return customerDTO;
    }
}
