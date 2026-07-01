/*
Question: ATM Machine Simulator

Write a program to simulate basic ATM operations.

Requirements:
1. Prompt the user to enter a 4-digit PIN.
2. If the PIN is correct (assume the correct PIN is "1234"), display a menu:
   1. Check Balance
   2. Withdraw Money
   3. Deposit Money
   4. Exit
3. Check Balance: Display current balance. Initial balance is Rs.10000.
4. Withdraw Money:
   - Amount should be less than or equal to balance.
   - Amount should be multiple of 100.
5. Deposit Money:
   - Amount should be multiple of 100.
   - Amount should be less than 40000.
6. If PIN is incorrect, deny access.
7. Handle invalid menu choices.
*/

import java.util.Scanner;

public class ATMMachineSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;

        System.out.print("Enter your 4 digit pin:- ");
        int pin = sc.nextInt();

        if (pin == correctPin) {
            System.out.println("Welcome");
            System.out.println("1.Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            while (true) {
                System.out.println("Enter your choice (1/2/3/4):");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Your current balance is: " + balance);
                } 
                else if (choice == 2) {
                    System.out.print("Enter your withdraw amount:");
                    int withdraw = sc.nextInt();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance");
                    } 
                    else if (withdraw % 100 != 0) {
                        System.out.println("Please enter valid amount");
                    } 
                    else {
                        balance = balance - withdraw;
                        System.out.println("Withdraw successful");
                    }
                } 
                else if (choice == 3) {
                    System.out.print("Enter your Deposit amount:");
                    int deposit = sc.nextInt();

                    if (deposit < 40000 && deposit % 100 == 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful");
                    } 
                    else {
                        System.out.println("Enter valid amount");
                    }
                } 
                else if (choice == 4) {
                    System.out.println("Thank you");
                    break;
                } 
                else {
                    System.out.println("Invalid Option");
                }
            }
        } 
        else {
            System.out.println("Invalid password");
        }

        sc.close();
    }
}