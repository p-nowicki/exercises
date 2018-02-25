package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String args[]) {
        pascalPrint(5);
    }

    public List<String> pascalTriangle;

    public PascalTriangle() {
        pascalTriangle = new ArrayList<String>();
        pascalTriangle = new ArrayList<String>();
        pascalTriangle.add("     1 ");
        pascalTriangle.add("    1 1 ");
        pascalTriangle.add("   1 2 1 ");
        pascalTriangle.add("    1 3 3 1 ");
        pascalTriangle.add("  1 4 6 4 1 ");
    }

    public List<String> getPascalTriangle() {
        return pascalTriangle;
    }

    public static void pascalPrint(int r) {
        System.out.print("Number of rows: " + r);
        System.out.println();

        for (int i = 0; i < r; ++i) {
            for (int k = r; k > i; --k) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; ++j) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


