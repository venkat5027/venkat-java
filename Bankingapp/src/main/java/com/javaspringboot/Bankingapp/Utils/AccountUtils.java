package com.javaspringboot.Bankingapp.Utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE ="001";
    public static final String ACCOUNT_EXISTS_MESSAGE=" This User already has an Account created";
    public static final String ACCOUNT_CREATION_SUCESSS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="Account has been sucessfully created";
    public static final String ACCOUNT_NOT_EXISTS_CODE ="003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE="User with the provided accountNumber does not exit";
    public static final String ACCOUNT_FOUND_CODE="004";
    public static final String ACCOUNT_FOUND_MESSAGE="Account sucessfully found";
    public static final String ACCOUNT_CREDITED_SUCCESS_CODE="005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE="User Account Amount was successfully credited ";
    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficient Balance in your account";
    public static final String ACCOUNT_DEBITED_SUCCESS_CODE="007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE="Amount has been successfully debited";
    public static String generateAccountNumber(){
    /*
    2024 +random sixdigits
     */
    Year currentYear = Year.now();
    int min =100000;
    int max =999999;
    //random number generate between min and max
    int randamNumber= (int)Math.floor(Math.random()*(max-min +1)+min);
    //convert current year and randomnumber to strings ,then concatination
    String year=String.valueOf(currentYear);
    String randomNumber= String.valueOf(randamNumber);
    StringBuilder accountNumber =new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();

    }

}
