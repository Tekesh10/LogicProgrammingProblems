package logical_programs;

import java.util.Scanner;

public class FibonacciSeries {
    static void Fibonacci(int N) {
        int n1 = 0, n2 = 1;
        int count = 0;
        while (count < N) {
            System.out.println(n1 + "  ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count++;
        }
    } public static void main(String[] args) {
        System.out.println("Enter a value that you want Fibonacci Series to be printed");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Fibonacci(N);
    }
}
