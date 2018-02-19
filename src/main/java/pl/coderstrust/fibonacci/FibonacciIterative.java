package pl.coderstrust.fibonacci;

import java.util.Scanner;

public class FibonacciIterative {

    private static long Iteration() {

        long n1 = 0, n2 = 1, n3, i, count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }

    public static void main(String[] args) {

        Iteration();

    }
}
