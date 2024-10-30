package com.javaspringboot.Bankingapp.Service.Impl;

import com.javaspringboot.Bankingapp.Dto.BankResponse;
import com.javaspringboot.Bankingapp.Dto.CreditDebitRequest;
import com.javaspringboot.Bankingapp.Dto.EnquiryRequest;
import com.javaspringboot.Bankingapp.Dto.UserRequestDto;

public interface UserService {
   BankResponse createAccount(UserRequestDto userRequestDto);
   BankResponse balanceEnquiry(EnquiryRequest request);
   String nameEnquiry(EnquiryRequest request);
   BankResponse creditAccount(CreditDebitRequest request);
   BankResponse debitAccount(CreditDebitRequest request);
}
