package pl.coderstrust.figures;

import junitparams.Parameters;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class CircleTest {

    @Test
    @Parameters({"5, 78.5",
            "7, 153.86"})
    public void shouldCalculateCircleArea(int radius, String expected) {
        //given
        Circle circle = new Circle(radius);

        //when
        String result = String.valueOf(circle.calculateArea());

        //then
        assertThat(result, is(expected));

    }
}