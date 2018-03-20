package pl.coderstrust.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayListTest {

    List<Long> list1 = new ArrayList<>();

    @Test
    public void shouldReturnProperSizeWhenListIsNotEmpty() {

        //given
        list1.add(2L);
        list1.add(34L);
        list1.add(32L);

        //when
        int result = list1.size();

        //then
        assertThat(result, is(3));

    }

    @Test
    public void shouldReturnProperSizeWhenListIsEmpty() {

        //given

        //when
        int result = list1.size();

        //then
        assertThat(result, is(0));

    }

}
