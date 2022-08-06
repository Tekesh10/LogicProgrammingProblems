package com.bridgelabz.programs;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan amount");
        int P = sc.nextInt();
        System.out.println("Enter monthly Interest rate");
        int R = sc.nextInt();
        System.out.println("Enter number of Years Loan to be payed off");
        int Y = sc.nextInt();
        int n = 12 * Y;
        int r = R / (12 * 100);
        int base = (1 + r);
        int expo = (-n);
        double res = Math.pow(base,expo);
        int payment = (int) (P * r / (1 -(res)));
        System.out.println("Monthly Payment to be made "+payment);
    }
}
