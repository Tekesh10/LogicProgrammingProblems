package logical_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(n+" is not a Prime Number");
        } else if (n == 2 || n == 3) {
            System.out.println(n+" is a Prime Number");
        } else if (n % 2 == 0 || n % 3 ==0) {
            System.out.println(n+" is not a Prime Number");
        } else
            System.out.println(n+" is a Prime Number");
    }
}
