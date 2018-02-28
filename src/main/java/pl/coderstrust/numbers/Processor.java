package pl.coderstrust.numbers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String fileName, String resultFileName) throws FileNotFoundException {
        List<String> linesFromFile = fileProcessor.readLinesFromFile(fileName);

        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            if (line.matches("")) {
                resultLines.add(numbersProcessor.processLine(line));
            }
        }

        String abc = "";
        abc += "def";

        StringBuilder builder = new StringBuilder();
        builder.append("abc").append("def");
        builder.toString();

        fileProcessor.writeLinesToFile(resultLines, resultFileName);
    }
}
