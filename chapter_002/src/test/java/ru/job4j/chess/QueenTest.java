package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * QueenTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 13.06.2018
 */
public class QueenTest {
    /**
     * Test Queen1.
     * Проверяет движение королевы.
     */
    @Test
    public void whenQueenMuwUpThenTrue() {
        Queen queen = new Queen(Cell.B8);
        Board figure = new Board();
        figure.add(queen);
        assertThat(figure.move(Cell.B8, Cell.B2), is(true));
    }
    /**
     * Test Queen2.
     * Проверяет движение королевы.
     */
    @Test
    public void whenQueenMuwRightThenTrue() {
        Queen queen = new Queen(Cell.B8);
        Board figure = new Board();
        figure.add(queen);
        assertThat(figure.move(Cell.B8, Cell.D8), is(true));
    }
    /**
     * Test Queen3.
     * Проверяет движение королевы.
     */
    @Test
    public void whenQueenMuwDiogonalThenTrue() {
        Queen queen = new Queen(Cell.B8);
        Board figure = new Board();
        figure.add(queen);
        assertThat(figure.move(Cell.B8, Cell.F4), is(true));
    }
    /**
     * Test Queen4.
     * Проверяет движение королевы.
     */
    @Test
    public void whenQueenMuwThenFalse() {
        Queen queen = new Queen(Cell.B8);
        Board figure = new Board();
        figure.add(queen);
        assertThat(figure.move(Cell.B8, Cell.A4), is(false));
    }
}
