package pl.coderstrust.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {

    public static void main(String[] args) {

        xMasTree(5);

    }

    public static List<String> xMasTree(int height) {
        List<String> result = new ArrayList<>();

        String line = "";
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < height - i; ++j) {
                line += " ";
            }
            for (int j = 0; j <= i * 2; ++j) {
                line += "*";

            }
            result.add(line);
            line = new String();

        }

        String trunk = "";
        for (int j = 0; j <= height + 1; ++j) {
            if (j >= height - 1) {
                trunk += "*";
            } else {
                trunk += " ";
            }
        }
        result.add(trunk);
        return result;
    }
}




