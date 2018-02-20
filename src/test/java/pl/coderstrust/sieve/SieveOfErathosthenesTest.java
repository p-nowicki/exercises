package pl.coderstrust.sieve;

import junitparams.JUnitParamsRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class SieveOfErathosthenesTest {

    @Test
    public void shouldHave4ElementsWhenInputIs10() {

        //given
        int input = 10;
        int expected = 4;


        //when
        int [] result = new SieveOfErathosthenes().sieveOfErathostenes(input);

        //then
        assertEquals(4, expected, result.length);

    }

    @Test
    public void shouldPrint4PrimesForInput10() {

        //given
        int input = 10;
        int [] expected = {2, 3, 5, 7};

        //when
        int [] result = new SieveOfErathosthenes().sieveOfErathostenes(input);

        //then
        assertArrayEquals(expected, result);

    }

    @Test
    public void shouldPrint7PrimesForInput18() {

        //given
        int input = 18;
        int [] expected = {2, 3, 5, 7, 11, 13, 17};

        //when
        int [] result = new SieveOfErathosthenes().sieveOfErathostenes(input);

        //then
        assertArrayEquals(expected, result);

    }
}