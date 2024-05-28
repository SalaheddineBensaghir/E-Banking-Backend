package com.sid.ebankingbackend.web;

import com.sid.ebankingbackend.dtos.CustomerDTO;
import com.sid.ebankingbackend.entites.Customer;
import com.sid.ebankingbackend.exception.CustomerNotFoundException;
import com.sid.ebankingbackend.services.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j

public class CustomerRestController {
    private BankAccountService bankAccountService;
@GetMapping("/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }
@GetMapping("/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable(name = "id") Long customerId) throws CustomerNotFoundException {
return bankAccountService.getCustomer(customerId);
    }
@PostMapping("/customers")
    public CustomerDTO saveCustomer (@RequestBody CustomerDTO customerDTO){
    bankAccountService.saveCustomer(customerDTO);
    return customerDTO;

    }
    @PutMapping("/customers/{customerId}")
    public CustomerDTO updateCustomer(@PathVariable Long customerId ,@RequestBody CustomerDTO customerDTO){
customerDTO.setId(customerId);
return bankAccountService.updateCustomer(customerDTO);
    }
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id){

        bankAccountService.deleteCustomer(id);

    }
}
