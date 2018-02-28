package pl.coderstrust.numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String fileName) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();

        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        return lines;
    }

    public void writeLinesToFile(List<String> resultLines, String resultFileName) {
    }
}
