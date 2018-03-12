package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TriangleTest {

    @Test
    @Parameters({"5, 5, 12.5",
            "14, 8, 56.0",
            "4, 10, 20.0",
            "13, 7, 45.5"})
    public void shouldCalculateTriangleArea(double base, double height, String expected) {
        //given
        Triangle triangle = new Triangle(base, height);

        //when
        String result = String.valueOf(triangle.calculateArea());

        //then
        assertThat(result, is(expected));

    }

}