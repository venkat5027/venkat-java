package com.javaspringboot.Bankingapp.Controller;

import com.javaspringboot.Bankingapp.Dto.BankResponse;
import com.javaspringboot.Bankingapp.Dto.CreditDebitRequest;
import com.javaspringboot.Bankingapp.Dto.EnquiryRequest;
import com.javaspringboot.Bankingapp.Dto.UserRequestDto;
import com.javaspringboot.Bankingapp.Service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/account")
    public BankResponse createAccount(@RequestBody UserRequestDto userRequestDto){
        return userService.createAccount(userRequestDto);

    }
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request ){
        return userService.nameEnquiry(request);
    }
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }
@PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
}
}
