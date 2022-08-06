package logical_programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number => ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        int i = 1;
        while(i <= n / 2) {
            if(n % i == 0) {
                sum = sum + i;
            }
            i++;
        } if(sum == n) {
            System.out.println(n+" is a Perfect Number");
        } else
            System.out.println(n+" is not a Perfect Number");
    }
}
