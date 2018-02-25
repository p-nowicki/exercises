package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static void main(String[] args) {

        multiTable(10);

    }

    public List<String> multiplicationTable;

    public MultiplicationTable() {

        multiplicationTable = new ArrayList<String>();
        multiplicationTable.add("       1   2   3   4   5   6   7   8   9  10");
        multiplicationTable.add("   1   1   2   3   4   5   6   7   8   9  10");
        multiplicationTable.add("   2   2   4   6   8  10  12  14  16  18  20");
        multiplicationTable.add("   3   3   6   9  12  15  18  21  24  27  30");
        multiplicationTable.add("   4   4   8  12  16  20  24  28  32  36  40");
        multiplicationTable.add("   5   5  10  15  20  25  30  35  40  45  50");
        multiplicationTable.add("   6   6  12  18  24  30  36  42  48  54  60");
        multiplicationTable.add("   7   7  14  21  28  35  42  49  56  63  70");
        multiplicationTable.add("   8   8  16  24  32  40  48  56  64  72  80");
        multiplicationTable.add("   9   9  18  27  36  45  54  63  72  81  90");
        multiplicationTable.add("  10  10  20  30  40  50  60  70  80  90 100");
    }

    public List<String> getMultiplicationTable() {
        return multiplicationTable;
    }

    public static void multiTable(int numberByNumber) {

        System.out.format("    ");

        for (int i = 1; i <= numberByNumber; ++i) {
            System.out.format("%4d", i);
        }
        System.out.println();

        for (int j = 1; j <= numberByNumber; ++j) {

            System.out.format("%4d", j);

            for (int i = 1; i <= numberByNumber; ++i) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }
}