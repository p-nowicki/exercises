package pl.coderstrust.numbers;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Processor processor = new Processor(new NumbersProcessor(), new FileProcessor());
        processor.process("src\\main\\resources\\1000.txt", "output.txt");
    }
}
