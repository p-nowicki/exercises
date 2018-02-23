package pl.coderstrust.fibonacci;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static pl.coderstrust.fibonacci.FibonacciRecursive.recursion;

public class FibonacciRecursiveTest {

    @Test
    public void shouldReturn0For0() {
        //given
        int count = 0;

        //when
        long result = recursion(count);

        //then
        assertThat(result, is(0L));
    }

    @Test
    public void shouldReturn1For1() {
        //given
        int count = 1;

        //when
        long result = recursion(count);

        //then
        assertThat(result, is(1L));

    }
}