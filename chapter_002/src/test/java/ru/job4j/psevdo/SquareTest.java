package ru.job4j.psevdo;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SquareTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 14.04.2018
 */
public class SquareTest {
    /**
     * Test draw square.
     * Проверяет прорисовку квадрата.
     */
    @Test
    public void whenRawSquareThenSquare() {
        Square square = new Square();
        String ln = System.lineSeparator();
        assertThat(square.draw(), is(new StringBuilder().append("+++++++")
                .append(ln)
                .append("+     +")
                .append(ln)
                .append("+     +")
                .append(ln)
                .append("+++++++").toString()));
    }
}
