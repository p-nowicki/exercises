package pl.coderstrust.numbers;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters({"      2      3      5      7     11     13     17     19     23     29 , 2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 = 129",
            "   2221   2237   2239   2243   2251   2267   2269   2273   2281   2287 , 2221 + 2237 + 2239 + 2243 + 2251 + 2267 + 2269 + 2273 + 2281 + 2287 = 22568",
            "    739    743    751    757    761    769    773    787    797    809 , 739 + 743 + 751 + 757 + 761 + 769 + 773 + 787 + 797 + 809 = 7686",
            "   1523   1531   1543   1549   1553   1559   1567   1571   1579   1583 , 1523 + 1531 + 1543 + 1549 + 1553 + 1559 + 1567 + 1571 + 1579 + 1583 = 15558"})
    public void shouldReturnSumOfElementsInLine(String line, String expected) {

        //given
        NumbersProcessor numbersProcessor = new NumbersProcessor();


        //when
        String result = numbersProcessor.processLine(line);

        //then
        assertThat(result, is(expected));
    }


}