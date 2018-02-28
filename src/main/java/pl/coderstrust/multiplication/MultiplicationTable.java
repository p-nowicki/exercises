package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static void main(String[] args) {

        multiTable(10);

    }

    public static List<String> multiTable(int numberByNumber) {
        List<String> result = new ArrayList<String>();

        String firstLine = "    ";

        for (int i = 1; i <= numberByNumber; ++i) {
            firstLine += String.format("%4d", i);
        }
        result.add(firstLine);

        //String nextLines = "";
        for (int j = 1; j <= numberByNumber; ++j) {
            String nextLines = "";
            nextLines += String.format("%4d", j);

            for (int i = 1; i <= numberByNumber; ++i) {
                nextLines += String.format("%4d", i * j);
            }
            result.add(nextLines);
        }
        return result;
    }
}