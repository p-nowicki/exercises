package pl.coderstrust.sieve;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
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
    public void shouldHave4ElementsWhenInputIs10WithAssertThat() {

        //given
        int input = 10;
        int expected = 4;

        //when
        int [] result = new SieveOfErathosthenes().sieveOfErathostenes(input);

        //then
        assertThat(result.length,is(equalTo(expected)));

    }



}