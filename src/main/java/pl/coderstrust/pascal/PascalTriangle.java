package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String args[])
    {
        pascalPrint();
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

    public static void pascalPrint() {
        int r, i, k, number, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");
        r = sc.nextInt();

        for (i = 0; i < r; ++i)
        {
            for(k = r; k > i; --k)
            {
                System.out.print(" ");
            }
            number = 1;
            for(j = 0; j <= i; ++j)
            {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


