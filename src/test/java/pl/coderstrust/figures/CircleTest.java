package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Test
    @Parameters({"5, 78.5",
            "7, 153.86",
            "14, 615.44",
            "10, 314.0"})
    public void shouldCalculateCircleArea(int radius, double expected) {
        //given
        Circle circle = new Circle(radius);

        //when
        double result = circle.calculateArea();

        //then
        assertThat(result, is(expected));

    }
}