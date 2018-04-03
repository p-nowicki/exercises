package pl.coderstrust.numbers;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class ProcessorTest {

    @Test
    public void processTest() throws IOException {

        //given
        FileProcessor fileProcessor = mock(FileProcessor.class);
        NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        when(fileProcessor.readLinesFromFile(inputFile)).thenReturn(Arrays.asList("1", "2"));

        //when
        processor.process(inputFile, outputFile);

        //then
        verify(fileProcessor).readLinesFromFile(inputFile);

        verify(numbersProcessor, times(2)).processLine((String) any());

        verify(numbersProcessor).processLine("1");
        verify(numbersProcessor).processLine("2");

        verify(fileProcessor).writeLinesToFile(any(List.class), eq(outputFile));
    }

    @Test
    public void processTestWithException() throws IOException {

        //given
        FileProcessor fileProcessor = mock(FileProcessor.class);
        NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        when(fileProcessor.readLinesFromFile(inputFile)).thenThrow(new FileNotFoundException("my exception"));

        //when
        try {
            processor.process(inputFile, outputFile);
            fail("exception should be thrown");
        } catch (FileNotFoundException ex) {
            //then
            assertTrue(ex instanceof FileNotFoundException);
            assertEquals("my exception", ex.getMessage());
        }
        //then
        verify(fileProcessor).readLinesFromFile(inputFile);

        verify(numbersProcessor, times(2)).processLine((String) any());

        verify(numbersProcessor).processLine("1");
        verify(numbersProcessor).processLine("2");

        verify(fileProcessor).writeLinesToFile(any(List.class), eq(outputFile));
    }

}
