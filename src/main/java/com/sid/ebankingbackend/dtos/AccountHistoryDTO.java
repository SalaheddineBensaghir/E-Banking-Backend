package com.sid.ebankingbackend.dtos;

import lombok.Data;

import java.util.List;
@Data
public class AccountHistoryDTO {
    private String accountId;
    private double balance;
    private int currentPage;
    private int totalPage;
    private int PageSize;
    private List<AccountOperationDTO> accountOperationDTOS;
}
