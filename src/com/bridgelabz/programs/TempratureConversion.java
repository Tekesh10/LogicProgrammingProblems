package com.bridgelabz.programs;

import java.util.Scanner;

public class TempratureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature value");
        int t = sc.nextInt();
        System.out.println("Enter the Temperature unit (C or F)");
        char u = sc.next().charAt(0);
        int Fa,Ce;
        if (u == 'c' || u == 'C') {
            Fa = (t * 9 / 5) + 32;
            System.out.println(t + "C = " + Fa + "F");
        } else if (u == 'f' || u == 'F') {
            Ce = (t - 32) * 5 / 9;
            System.out.println(t + "F = " + Ce + "C");
        } else
            System.out.println("Invalid unit");
    }
}
