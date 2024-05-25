package com.sid.ebankingbackend.services;

import com.sid.ebankingbackend.entites.BankAccount;
import com.sid.ebankingbackend.entites.CurrentAccount;
import com.sid.ebankingbackend.entites.Customer;
import com.sid.ebankingbackend.entites.SavingAccount;
import com.sid.ebankingbackend.exception.BankAccountNotFoundException;
import com.sid.ebankingbackend.exception.BlanceNotSufficentException;
import com.sid.ebankingbackend.exception.CustomerNotFoundException;
import com.sid.ebankingbackend.repositories.BankAccountRepository;

import java.util.List;

public interface BankAccountService {

     Customer saveCustomer (Customer customer);
     CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
     SavingAccount saveSavingCurrentBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;

     List<Customer> listCustomers();
     BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
     void debit(String accountId,double amount,String description) throws BankAccountNotFoundException, BlanceNotSufficentException;

     void credit(String accountId,double amount,String description) throws BankAccountNotFoundException;
     void transfer(String accountIdSource,String accountIdDestination,double amount) throws BlanceNotSufficentException, BankAccountNotFoundException;

     List<BankAccount> bankAccountList();
}
