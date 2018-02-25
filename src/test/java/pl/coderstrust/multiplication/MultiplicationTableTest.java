package pl.coderstrust.multiplication;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiplicationTableTest {

    private MultiplicationTable tableMultiplication;

    @Test
    public void shouldMakeExpectedEqualOurList() {

        //given
        tableMultiplication = new MultiplicationTable();
        List<String> christmasTree = tableMultiplication.getMultiplicationTable();

        //when
        List<String> actual = christmasTree;
        List<String> expected = Arrays.asList("");

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssertListsSizeIsEqual() {

        //given
        tableMultiplication = new MultiplicationTable();
        List<String> christmasTree = tableMultiplication.getMultiplicationTable();

        //when
        List<String> actual = christmasTree;
        List<String> expected = Arrays.asList("");

        //then
        assertThat(actual.size(), is(expected.size()));
    }

    @Test
    public void shouldAssertListContainsGivenValue() {

        //given
        tableMultiplication = new MultiplicationTable();
        List<String> christmasTree = tableMultiplication.getMultiplicationTable();

        //when
        List<String> actual = christmasTree;

        //then
        assertThat(actual, hasItems(""));
    }


}