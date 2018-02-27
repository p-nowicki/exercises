package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String args[]) {
        pascalPrint(5);

    }

    public static List<String> pascalPrint(int rows) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < rows; ++i) {
            String line = "";
            for (int k = rows; k > i; --k) {
                line += " ";
            }
            int number = 1;
            for (int j = 0; j <= i; ++j) {
                line += (number + " ");
                number = number * (i - j) / (j + 1);
            }
            result.add(line);
        }
        return result;
    }
}


