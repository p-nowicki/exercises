package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    public static void main(String[] args) {

        xMasTree();

    }

    public List<String> christmasTree;
    public ChristmasTree() {
        christmasTree = new ArrayList<String>();
        christmasTree.add("     *");
        christmasTree.add("    ***");
        christmasTree.add("   *****");
        christmasTree.add("  *******");
        christmasTree.add(" *********");
        christmasTree.add("    ***");
    }
    public List<String> getChristmasTree() {
        return christmasTree;
    }


    public static void xMasTree() {
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




