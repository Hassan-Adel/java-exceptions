package com.tutorial.exceptions;

public class Account {

    public void deposit(float value){
        if(value <=0 ){
            throw new IllegalArgumentException("value cannot be less than zero");
        }
    }
}
