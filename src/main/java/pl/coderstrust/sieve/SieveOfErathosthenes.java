package pl.coderstrust.sieve;

import java.util.Scanner;

public class SieveOfErathosthenes {

    private void sieveOfErath(int n) {

        boolean prime [] = new  boolean[n + 1];

        for (int i = 0; i < n; ++i)
            prime[i] = true;

        for (int j = 2; j * j <= n; ++j) {
            if(prime[j]) {
                for (int k = j * 2; k <= n; k += j)
                    prime[k] = false;
            }
        }

        for (int l = 2; l <= n; ++l) {
            if(prime[l]) {
                System.out.print(l + " ");
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("The prime numbers smaller or equal to " + n + " are: ");
        SieveOfErathosthenes sieve = new SieveOfErathosthenes();
        sieve.sieveOfErath(n);



    }

}
