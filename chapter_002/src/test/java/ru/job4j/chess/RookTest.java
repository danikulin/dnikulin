package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * RookTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 13.06.2018
 */
public class RookTest {
    /**
     * Test Rook1.
     * Проверяет движение ладьи.
     */
    @Test
    public void whenRookMuwUpThenTrue() {
        Rook rook = new Rook(Cell.B8);
        Board figure = new Board();
        figure.add(rook);
        assertThat(figure.move(Cell.B8, Cell.B2), is(true));
    }
    /**
     * Test Rook2.
     * Проверяет движение ладьи.
     */
    @Test
    public void whenRookMuwRightThenTrue() {
        Rook rook = new Rook(Cell.B8);
        Board figure = new Board();
        figure.add(rook);
        assertThat(figure.move(Cell.B8, Cell.E8), is(true));
    }
    /**
     * Test Rook3.
     * Проверяет движение ладьи.
     */
    @Test
    public void whenRookMuwThenFalse() {
        Rook rook = new Rook(Cell.B8);
        Board figure = new Board();
        figure.add(rook);
        assertThat(figure.move(Cell.B8, Cell.A2), is(false));
    }
    /**
     * Test Rook3.
     * Проверяет движение ладьи.
     */
    @Test
    public void whenRookMuwDiogonalThenFalse() {
        Rook rook = new Rook(Cell.B8);
        Board figure = new Board();
        figure.add(rook);
        assertThat(figure.move(Cell.B8, Cell.E5), is(false));
    }
}
