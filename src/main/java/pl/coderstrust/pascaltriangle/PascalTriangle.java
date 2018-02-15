package pl.coderstrust.pascaltriangle;

import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String args[])
    {
        PascalPrint();
    }

    private static void PascalPrint() {
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


