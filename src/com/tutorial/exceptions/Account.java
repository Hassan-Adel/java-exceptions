package com.tutorial.exceptions;

public class Account {

    private float balance;

    public void deposit(float value){
        if(value <=0 ){
            throw new IllegalArgumentException("value cannot be less than zero");
        }
    }

    public void withdraw(float value) throws InsufficientFundsException {
        if(value >balance){
            throw new InsufficientFundsException();
        }
    }
}
