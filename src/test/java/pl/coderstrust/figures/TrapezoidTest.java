package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TrapezoidTest {

    @Test
    @Parameters({"5, 5, 4, 20.0",
            "7, 4, 12, 66.0",
            "4, 10, 2, 14.0",
            "10, 20, 9, 135.0"})
    public void shouldCalculateTrapezoidArea(double parallelSideA, double parallelSideB, double height, double expected) {
        //given
        Trapezoid trapezoid = new Trapezoid(parallelSideA, parallelSideB, height);

        //when
        double result = trapezoid.calculateArea();

        //then
        assertThat(result, is(expected));

    }

}