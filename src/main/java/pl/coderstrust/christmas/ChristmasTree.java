package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChristmasTree {

    public static void main(String[] args) {
        List<String> christmasTree = new ArrayList<>();
       //xmasTree();

        christmasTree.add("     *");
        christmasTree.add("    ***");
        christmasTree.add("   *****");
        christmasTree.add("  *******");
        christmasTree.add(" *********");
        christmasTree.add("    ***");
        System.out.println();
    }

    public static void xmasTree() {
        int height = 5;

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




