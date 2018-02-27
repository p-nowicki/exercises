package pl.coderstrust.pascal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static pl.coderstrust.pascal.PascalTriangle.pascalPrint;

public class PascalTriangleTest {

    @Test
    public void shouldMakeExpectedEqualOurList() {

        //given
        int rows = 5;

        //when
        List<String> actual = pascalPrint(rows);
        List<String> expected = Arrays.asList("     1 ", "    1 1 ", "   1 2 1 ", "  1 3 3 1 ", " 1 4 6 4 1 ");

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssertListsSizeIsEqual() {


        //given
        int rows = 5;

        //when
        List<String> actual = pascalPrint(rows);
        List<String> expected = Arrays.asList("     1 ", "    1 1 ", "   1 2 1 ", "  1 3 3 1 ", " 1 4 6 4 1 ");

        //then
        assertThat(actual.size(), is(expected.size()));
    }

    @Test
    public void shouldAssertListContainsGivenValue() {

        //given
        int rows = 5;

        //when
        List<String> actual = pascalPrint(rows);

        //then
        assertThat(actual, hasItems("   1 2 1 ", "    1 1 ", " 1 4 6 4 1 "));
    }

}
