package com.tutorial;

import com.tutorial.exceptions.ExceptionsDemo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            ExceptionsDemo.show();
        }catch (Exception ex){
            System.out.println(ex.getClass());
        }
    }
}
