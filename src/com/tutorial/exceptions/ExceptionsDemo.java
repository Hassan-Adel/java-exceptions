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
    public static void showCheckedException() {
        try {
            var reader = new FileReader("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File doesn't exist!");
        }
        System.out.println("File opened");
    }

    private static void sayHello(String string) {
        System.out.println(string.toUpperCase());
    }
}
