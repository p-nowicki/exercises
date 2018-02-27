package pl.coderstrust.christmas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static pl.coderstrust.christmas.ChristmasTree.xMasTree;

public class ChristmasTreeTest {

    // private ChristmasTree aBeautifulTree;


    @Test
    public void shouldMakeExpectedEqualOurList() {

        //given
        int height = 5;

        //when
        List<String> actual = xMasTree(height);
        List<String> expected = Arrays.asList("     *",
                "    ***",
                "   *****",
                "  *******",
                " *********",
                "    ***");

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssertListsSizeIsEqual() {

        //given
        int height = 5;

        //when
        List<String> actual = xMasTree(height);
        List<String> expected = Arrays.asList("     *",
                "    ***",
                "   *****",
                "  *******",
                " *********",
                "    ***");

        //then
        assertThat(actual.size(), is(expected.size()));
    }

    @Test
    public void shouldAssertListContainsGivenValue() {

        //given
        int height = 5;

        //when
        List<String> actual = xMasTree(height);
//      List<String> expected = Arrays.asList("     *", "    ***", "   *****", "  *******", " *********", "    ***");

        //then
        assertThat(actual, hasItems("     *", " *********", "    ***"));
    }


}
