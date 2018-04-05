package pl.coderstrust.numbers;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Processor processor = new Processor(new NumbersProcessor(), new FileProcessor());
        processor.process("src\\main\\resources\\1000.txt", "output.txt");


    }
}
