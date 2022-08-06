package logical_programs;

import java.util.Scanner;

public class ReverseaNumber {
    static int reverse(int n) {
        int remainder, reverse = 0;
        while (n>0) {
            remainder = (n % 10);
            reverse = ((reverse * 10) + remainder);
            n = (n / 10);
        } return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number to be Reversed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse Number of "+n+" is "+reverse(n));
    }

}

