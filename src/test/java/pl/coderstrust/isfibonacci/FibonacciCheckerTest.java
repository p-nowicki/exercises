package pl.coderstrust.isfibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static pl.coderstrust.isfibonacci.FibonacciChecker.isFibonacciNumber;
import static pl.coderstrust.isfibonacci.FibonacciChecker.isFibonacciNumber;

@RunWith(JUnitParamsRunner.class)
public class FibonacciCheckerTest {

    @Test
    public void shouldReturnTrueFor1() {
        //given
        int n = 1;

        //when
        boolean result = isFibonacciNumber(n);

        //then
        assertThat(result, is(true));
    }

    @Test
    @Parameters({"0, false",
            "1, true",
            "2, true",
            "50, false",
            "77, false",
            "120, false",
            "144, true"})
    public void shouldReturnProperBooleanForResult(int n, boolean expected) {
        //given

        //when
        boolean result = isFibonacciNumber(n);

        //then
        assertThat(result, is(expected));
    }

}