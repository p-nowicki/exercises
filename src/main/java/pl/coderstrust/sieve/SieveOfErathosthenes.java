package pl.coderstrust.sieve;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErathosthenes {

    public int[] sieveOfErathostenes(int n) {
        boolean prime [] = new  boolean[n + 1];

        for (int i = 0; i < n; ++i)
            prime[i] = true;

        for (int j = 2; j * j <= n; ++j) {
            if(prime[j]) {
                for (int k = j * 2; k <= n; k += j)
                    prime[k] = false;
            }
        }

        int numberOfPrimes = 0;
        for (int l = 2; l <= n; ++l) {
            if (prime [l]) {
                ++numberOfPrimes;
            }
        }

        int primes [] = new int[numberOfPrimes];
        int index = 0;
        for (int m = 2; m <= n; ++m) {
            if (prime[m]) {
                primes [index++] = m;
            }
        }

        System.out.print(Arrays.toString(primes));
        return(primes);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The prime numbers smaller or equal to " + n + " are: ");
        SieveOfErathosthenes sieve = new SieveOfErathosthenes();
        sieve.sieveOfErathostenes(n);

    }

}
