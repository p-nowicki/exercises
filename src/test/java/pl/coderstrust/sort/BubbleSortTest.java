package pl.coderstrust.sort;

import org.junit.Test;

import static org.junit.Assert.*;

import static pl.coderstrust.sort.BubbleSort.sortBubble;

public class BubbleSortTest {

    @Test
    public void shouldSortGivenArrayOf7Elements() {
        //when
        int given[] = {13, 25, 11, 4, 33, 8, 2};
        int expected[] = {2, 4, 8, 11, 13, 25, 33};
        //given
        sortBubble(given);
        //then
        assertArrayEquals(expected, given);
        assertEquals(7, given.length);

    }

    @Test
    public void shouldHave7ElementsInArray() {
        //when
        int given[] = {13, 25, 11, 4, 33, 8, 2};
        int expected[] = {2, 4, 8, 11, 13, 25, 33};
        //given
        sortBubble(given);
        //then
        assertEquals(7, given.length);

    }
}