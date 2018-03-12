package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RectangleTest {

    @Test
    @Parameters({"5, 5, 25.0",
            "7, 4, 28.0",
            "4, 10, 40.0",
            "10, 20, 200.0"})
    public void shouldCalculateRectangleArea(double sideA, double sideB, String expected) {
        //given
        Rectangle rectangle = new Rectangle(sideA, sideB);

        //when
        String result = String.valueOf(rectangle.calculateArea());

        //then
        assertThat(result, is(expected));

    }

}