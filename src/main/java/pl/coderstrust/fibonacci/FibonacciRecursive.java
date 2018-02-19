package pl.coderstrust.fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {

    private static long Recursion(int n) {

        if (n < 0) {
            return 1;
        } else if (n > 0) {
            return Recursion(n - 1) + Recursion(n - 2);
        }
        return 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        for (int i = 0; i <= numbers; ++i) {
            long result = Recursion(i);
            System.out.print(result + " ");
        }

    }
}
