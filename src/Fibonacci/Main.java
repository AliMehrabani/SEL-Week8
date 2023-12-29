package Fibonacci;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the fibonacci index: ");
        int n = scanner.nextInt();
        System.out.println("fibonacci " + n + " is: " + fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
