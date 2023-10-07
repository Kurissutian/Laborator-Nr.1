import java.util.Scanner;

public class Fibonacci2 {
    public static long fib2(int n) {
        int i = 1;
        int j = 0;
        for (int k = 1; k <= n; k++) {
            int temp = j;
            j = i + j;
            i = temp;
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type n: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime();
        long result = fib2(n);
        long endTime = System.nanoTime();

        double executionTimeMillis = (endTime - startTime) / 1e6;

        System.out.println("The " + n + " Fibonacci number is: " + result);
        System.out.printf("Execution time: %.6f milliseconds\n", executionTimeMillis);

        scanner.close();
    }
}