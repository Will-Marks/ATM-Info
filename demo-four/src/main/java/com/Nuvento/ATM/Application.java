package com.Nuvento.ATM;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Please enter your ID");

        Scanner input = new Scanner(System.in);

        input.nextInt();


        System.out.println("Welcome");

        System.out.println("1 for Deposit");
        System.out.println("2 for Withdraw");
        System.out.println("3 for Balance");
        System.out.println("q to Quit");


    }
}
