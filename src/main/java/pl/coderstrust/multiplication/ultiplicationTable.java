package pl.coderstrust.multiplication;

import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        multiTable();

    }

    private static void multiTable() {

        Scanner sc = new Scanner(System.in);

        int numberByNumber = sc.nextInt();

        System.out.format("    ");

        for (int i = 1; i <= numberByNumber; ++i) {
            System.out.format("%4d", i);
        }
        System.out.println();

        for (int j = 1; j <= numberByNumber; ++j) {

            System.out.format("%4d", j);

            for (int i = 1; i <= numberByNumber; ++i) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}

