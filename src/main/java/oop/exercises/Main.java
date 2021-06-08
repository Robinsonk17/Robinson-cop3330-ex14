package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        double amount, tax;
        String state;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        amount = input.nextDouble();
        System.out.print("What is the the state? ");
        state = input.next();

        tax = 0.0;

        if (state.equals("WI"))
        {
            tax = 0.055;
            System.out.println("The subtotal is $" + amount + ".");
            System.out.println("The tax is $" + amount * tax + ".");
        }
        System.out.printf("The total is $%.2f. \n", amount * (1 + tax));
    }
}
