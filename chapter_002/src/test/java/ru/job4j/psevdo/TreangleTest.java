package ru.job4j.psevdo;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TreangleTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 14.04.2018
 */
public class TreangleTest {
    /**
     * Test draw treangle.
     * Проверяет прорисовку треугольника.
     */
    @Test
    public void whenDrawTreangleThenTreangle() {
        Treangle treangle = new Treangle();
        String ln = System.lineSeparator();
        assertThat(treangle.draw(), is(new StringBuilder().append("  +  ")
                .append(ln)
                .append(" + + ")
                .append(ln)
                .append("+++++").toString()));
    }
}