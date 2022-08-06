package com.bridgelabz.programs;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println("Integer "+in+" when converted to binary is "+Integer.toBinaryString(in));
        int swap = ((in & 0x0F) << 4 | (in & 0xF0) >> 4);
        System.out.println("The Swapped Nibble Integer is "+swap);
        if (swap % 2 == 0) {
            System.out.println("The New Number is a power of 2");
        } else
            System.out.println("The New Number is not a power of 2");
    }
}
