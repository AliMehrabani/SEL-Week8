package Fibonacci;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        CustomFunction(n);
    }

    public static void CustomFunction(int n) {
        long result;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result = fibonacci(i);
            }else {
                result = square(i);
            }
            System.out.println(result);
        }
    }

    public static long fibonacci(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);

        long num1 = 1;
        long num2 = 1;
        for (int i = 1; i < n;i++) {
            long temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }

    public static long square(int n) {
        return (long) n * n;
    }

}
