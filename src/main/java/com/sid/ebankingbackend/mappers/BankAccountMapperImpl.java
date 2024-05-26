package com.sid.ebankingbackend.mappers;

import com.sid.ebankingbackend.dtos.CustomerDTO;
import com.sid.ebankingbackend.entites.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImpl {

    public CustomerDTO fromCustomer(Customer customer){
       CustomerDTO customerDTO=new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDTO);
//       customerDTO.setId(customer.getId());
//       customerDTO.setName(customer.getName());
//       customerDTO.setEmail(customerDTO.getEmail());
        return  customerDTO;

    }
    public Customer fromCustomersDTO(CustomerDTO customerDTO){
      Customer customer = new Customer();
      BeanUtils.copyProperties(customerDTO,customer);
        return customer;
    }
}
