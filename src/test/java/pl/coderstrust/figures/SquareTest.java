package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {

    @Test
    @Parameters({"5, 25.0",
            "7, 49.0",
            "4, 16.0",
            "10, 100.0"})
    public void shouldCalculateSquareArea(double side, String expected) {
        //given
        Square square = new Square(side, side);

        //when
        String result = String.valueOf(square.calculateArea());

        //then
        assertThat(result, is(expected));

    }
}