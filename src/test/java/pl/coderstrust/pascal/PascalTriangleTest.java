package pl.coderstrust.pascal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PascalTriangleTest {

    private PascalTriangle trianglePascal;

    @Test
    public void shouldMakeExpectedEqualOurList() {

        //given
        trianglePascal = new PascalTriangle();
        List<String> pascalTriangle = trianglePascal.getPascalTriangle();

        //when
        List<String> actual = pascalTriangle;
        List<String> expected = Arrays.asList("     1 ", "    1 1 ", "   1 2 1 ", "    1 3 3 1 ", "  1 4 6 4 1 ");

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssertListsSizeIsEqual() {

        //given
        trianglePascal = new PascalTriangle();
        List<String> pascalTriangle = trianglePascal.getPascalTriangle();

        //when
        List<String> actual = pascalTriangle;
        List<String> expected = Arrays.asList("     1 ", "    1 1 ", "   1 2 1 ", "    1 3 3 1 ", "  1 4 6 4 1 ");

        //then
        assertThat(actual.size(), is(expected.size()));
    }

    @Test
    public void shouldAssertListContainsGivenValue() {

        //given
        trianglePascal = new PascalTriangle();
        List<String> pascalTriangle = trianglePascal.getPascalTriangle();

        //when
        List<String> actual = pascalTriangle;

        //then
        assertThat(actual, hasItems("    1 1 ", "  1 4 6 4 1 ", "    1 3 3 1 "));
    }

}