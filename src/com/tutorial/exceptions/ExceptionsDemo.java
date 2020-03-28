package com.tutorial.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo
{
    //unchecked Run time exception
    public static void show(){
        sayHello(null);
    }

    //Checked exception because java compiler checks them in runtime
    public static void showCheckedException() {
        try (
            var reader = new FileReader("");
            var writter = new FileWriter("...")
        ) {
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("cannot read data!");
        }

        System.out.println("File opened");
    }

    private static void sayHello(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void show2() throws IOException{
        var account = new Account();
        try{
            account.deposit(-1);
            throw new IOException();
        }catch (Throwable e){
            System.out.println("Logger");
            throw e;
        }
    }

    public static void show3(){
        var account = new Account();
        try{
            account.withdraw(-1);
        }catch (AccountException e){
            var cause = e.getCause();
            System.out.println(e.getMessage());
        }
    }

}
