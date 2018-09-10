package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BishopTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class BishopTest {
    /**
     * Test Bishop1.
     * Проверяет движение слона.
     */
    @Test
    public void whenBishopMuwThenTrue() {
        Bishop bishop = new Bishop(Cell.A1);
        Board figure = new Board();
        figure.add(bishop);
        assertThat(figure.move(Cell.A1, Cell.C3), is(true));
    }
    /**
     * Test Bishop2.
     * Проверяет движение слона.
     */
    @Test
    public void whenBishopMuwThenFalse() {
        Bishop bishop = new Bishop(Cell.A3);
        Board figure = new Board();
        figure.add(bishop);
        assertThat(figure.move(Cell.A3, Cell.A6), is(false));
    }
}
