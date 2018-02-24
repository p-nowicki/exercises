package pl.coderstrust.isfibonacci;

public class FibonacciChecker {

    public static boolean isFibonacciNumber(int n) {
        int n1 = 0;
        int n2 = 1;
        do {
            int Fibo = n1;
            n1 = n2;
            n2 = Fibo + n2;
        }
        while (n2 < n);

        return n2 == n;
    }
    public static void main(String[] args) {
        int n = 144;

        isFibonacciNumber(n);

    }
}
