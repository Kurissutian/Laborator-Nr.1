import java.util.Scanner;

public class Fibonacci3 {
    public static double phi = (1 + Math.sqrt(5)) / 2;
    public static double phi1 = (1 - Math.sqrt(5)) / 2;

    public static long fib3(int n) {
        return Math.round((Math.pow(phi, n) - Math.pow(phi1, n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type n: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long result = fib3(n);
        long endTime = System.currentTimeMillis();

        double executionTimeMillis = (endTime - startTime) / 1e6;

        System.out.println("The " + n + " Fibonacci number is: " + result);
        System.out.printf("Execution time: %.6f milliseconds\n", executionTimeMillis);

        scanner.close();
    }
}