package pl.coderstrust.numbers;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProcessorTest {

    @Test
    public void processTest() {

        //given
        FileProcessor fileProcessor = mock(FileProcessor.class);
        NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        //when


        //then


    }

}
