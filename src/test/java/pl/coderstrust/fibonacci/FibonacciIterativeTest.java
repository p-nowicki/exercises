package pl.coderstrust.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static pl.coderstrust.fibonacci.FibonacciIterative.iteration;

@RunWith(JUnitParamsRunner.class)
public class FibonacciIterativeTest {

    @Test
    public void shouldReturn0For0() {
        //given
        int count = 0;

        //when
        long result = iteration(count);

        //then
        assertThat(result, is(0L));
    }

    @Test
    public void shouldReturn1For1() {
        //given
        int count = 1;

        //when
        long result = iteration(count);

        //then
        assertThat(result, is(1L));
    }

    @Test
    @Parameters({"0, 0",
            "1, 1",
            "2, 1"})
    public void shouldReturnExpectedValueForGivenValue(int given, long expected) {
        //given

        //when
        long result = iteration(given);

        //then
        assertThat(result, is(expected));
    }



}