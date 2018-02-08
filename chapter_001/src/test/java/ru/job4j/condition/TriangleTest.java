package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * TriangleTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 08.02.2018
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(1, 4);
        Point b = new Point(1, 0);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 4D;
        assertThat(result, closeTo(expected, 0.1));
    }
}
