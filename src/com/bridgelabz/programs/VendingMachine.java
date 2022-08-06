package com.bridgelabz.programs;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rs to Vend");
        int rs = sc.nextInt();
        int[] notes = new int[]{1000,500,100,50,10,5,2,1};
        int[] noteCount = new int[]{0,0,0,0,0,0,0,0};
        int remain = rs;
        int index = 0;
        int count = 0;
        while (remain > 0) {
            if (remain >= notes[index]) {
                remain -= notes[index];
            } else {
                index++;
                remain -= notes[index];
            }
            count++;
            noteCount[index]++;
        }
        System.out.println("Total notes given => "+count);
        for (int i = 0; i < notes.length; i++){
            System.out.println("Note => "+notes[i]+" Count => "+noteCount[i]);
        }
    }
}