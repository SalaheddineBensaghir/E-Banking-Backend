package com.sid.ebankingbackend.repositories;

import com.sid.ebankingbackend.entites.AccountOperation;
import com.sid.ebankingbackend.entites.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
