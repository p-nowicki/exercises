package pl.coderstrust.foobar;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static pl.coderstrust.foobar.FooBar.fooBarImplementation;

@RunWith(JUnitParamsRunner.class)
public class FooBarTest {

    @Test
    public void shouldReturn100BarFor100() {
        //given
        int i = 100;

        //when
        String result = fooBarImplementation(i);

        //then
        assertThat(result, is("100 Bar"));
    }

    @Test
    @Parameters({"99, 99 Foo",
            "100, 100 Bar"})
    public void shouldReturn99For99(int i, String expected) {
        //given

        //when
        String result = fooBarImplementation(i);

        //then
        assertThat(result, is(expected));

    }
}