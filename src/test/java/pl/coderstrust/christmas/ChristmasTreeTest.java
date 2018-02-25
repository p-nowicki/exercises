package pl.coderstrust.christmas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ChristmasTreeTest {

    private ChristmasTree aBeautifulTree;


    @Test
    public void shouldMakeExpectedEqualOurList() {

        //given
        aBeautifulTree = new ChristmasTree();
        List<String> christmasTree = aBeautifulTree.getChristmasTree();

        //when
        List<String> actual = christmasTree;
        List<String> expected = Arrays.asList("     *", "    ***", "   *****", "  *******", " *********", "    ***");

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAssertListsSizeIsEqual() {

        //given
        aBeautifulTree = new ChristmasTree();
        List<String> christmasTree = aBeautifulTree.getChristmasTree();

        //when
        List<String> actual = christmasTree;
        List<String> expected = Arrays.asList("     *", "    ***", "   *****", "  *******", " *********", "    ***");

        //then
        assertThat(actual.size(), is(expected.size()));
    }

    @Test
    public void shouldAssertListContainsGivenValue() {

        //given
        aBeautifulTree = new ChristmasTree();
        List<String> christmasTree = aBeautifulTree.getChristmasTree();

        //when
        List<String> actual = christmasTree;
//        List<String> expected = Arrays.asList("     *", "    ***", "   *****", "  *******", " *********", "    ***");

        //then
        assertThat(actual, hasItems("     *", " *********", "    ***"));
    }

}
