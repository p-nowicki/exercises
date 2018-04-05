package pl.coderstrust.numbers;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileProcessorTest {

    @Test
    public void shouldReadTheContentOfFile() throws FileNotFoundException {

        //given
        List<String> expected = Arrays.asList("line 1", "line 2", "line 3");
        FileProcessor fileProcessor = new FileProcessor();

        //when
        List<String> result = fileProcessor.readLinesFromFile("src\\test\\resources\\pl\\coderstrust\\files\\test_input_file.txt");

        //then
        assertThat(result, is(expected));

    }

    @Test
    public void shouldWriteTheContentOfFile() throws IOException {

        //given
        List<String> expected = Arrays.asList("line 1", "line 2", "line 3");
        FileProcessor fileProcessor = new FileProcessor();

        //when
        fileProcessor.writeLinesToFile(expected, "src\\test\\resources\\pl\\coderstrust\\files\\test_output_file.txt");

        //then
        List<String> result = fileProcessor.readLinesFromFile("src\\test\\resources\\pl\\coderstrust\\files\\test_input_file.txt");
        assertThat(result, is(expected));
    }

}
