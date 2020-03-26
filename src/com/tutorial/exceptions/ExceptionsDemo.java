package com.tutorial.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo
{
    //unchecked Run time exception
    public static void show(){
        sayHello(null);
    }

    //Checked exception because java compiler checks them in runtime
    public static void showCheckedException() throws FileNotFoundException {
        var reader = new FileReader("");
    }

    private static void sayHello(String string) {
        System.out.println(string.toUpperCase());
    }
}
