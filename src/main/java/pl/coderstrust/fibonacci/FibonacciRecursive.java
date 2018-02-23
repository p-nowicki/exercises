package pl.coderstrust.fibonacci;

public class FibonacciRecursive {

    public static long recursion(int n) {

        if (n < 0) {
            return 1;
        } else if (n > 0) {
            return recursion(n - 1) + recursion(n - 2);
        }
        return 0;

    }

    public static void main(String[] args) {
        int numbers = 10;
        for (int i = 0; i <= numbers; ++i) {
            long result = recursion(i);
            System.out.print(result + " ");
        }

    }
}