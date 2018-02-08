package pl.coderstrust.multiplicationtable;

import java.util.Scanner;


public class multiplicationTable {
    public static void main(String[] args) {


        multiTable();

    }

    private static void multiTable() {
        Scanner sc = new Scanner(System.in);
        int numberByNumber = sc.nextInt();

        for (int j = 1; j <= numberByNumber; ++j) {

            for (int i = 1; i <= numberByNumber; ++i) {
                System.out.format("%4d", i * j);

            }
            System.out.println();
        }
    }
}
