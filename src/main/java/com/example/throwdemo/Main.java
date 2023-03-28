package com.example.throwdemo;

public class Main {

    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        System.out.println(accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println(accountManager.getBalance());

        try {
            accountManager.withdraw(30);
        }
        catch(BalanceInsufficientException exception){
            System.out.println(exception.getMessage());

        }
        System.out.println(accountManager.getBalance());

       try {
           accountManager.withdraw(80);
       }
       catch(BalanceInsufficientException exception){
           System.out.println(exception.getMessage());
       }
        System.out.println(accountManager.getBalance());
    }
}
