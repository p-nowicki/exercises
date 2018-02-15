package pl.coderstrust.christmastree;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        xmasTree();

    }

    private static void xmasTree() {

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < height - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j <= height + 1; ++j) {
            if (j >= height - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}

