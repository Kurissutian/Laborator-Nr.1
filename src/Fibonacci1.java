import java.util.Scanner;

public class Fibonacci1 {
    public static long fib1(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type n: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        long result = fib1(n);

        long endTime = System.currentTimeMillis();
        System.out.println("The " + n + " Fibonacci number is: " + result);
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " milliseconds");

        scanner.close();
    }
}