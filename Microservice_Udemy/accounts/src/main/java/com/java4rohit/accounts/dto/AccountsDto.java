package com.java4rohit.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;



@Data
@ToString
public class AccountsDto {


    @Column(name = "account_number")
    private  Long accountNumber;

    @Column(name = "account_type")
    private  String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
