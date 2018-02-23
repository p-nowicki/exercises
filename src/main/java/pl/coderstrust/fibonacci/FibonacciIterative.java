package pl.coderstrust.fibonacci;

public class FibonacciIterative {

    public static long iteration(int count) {

        long n1 = 0;
        long n2 = 1;
        long n3;
        for (int i = 0; i < count; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }

    public static void main(String[] args) {

        iteration(1);

    }
}