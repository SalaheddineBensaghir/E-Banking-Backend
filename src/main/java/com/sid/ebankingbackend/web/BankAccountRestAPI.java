package com.sid.ebankingbackend.web;

import com.sid.ebankingbackend.services.BankAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BankAccountRestAPI {

    private BankAccountService bankAccountService;



}
