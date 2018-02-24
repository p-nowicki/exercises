package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
       // int height = 5;

        result.add(xmasTree(5));

    }

    public static String xmasTree(int height) {

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
        return new String (" * ");
    }
}




