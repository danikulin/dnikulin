package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PawnTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class PawnTest {
    /**
     * Test Pawn1.
     * Проверяет движение пешки.
     */
    @Test
    public void whenPawnFirstMuwThenTrue() {
        Pawn pawn = new Pawn(Cell.A7);
        Board figure = new Board();
        figure.add(pawn);
        assertThat(figure.move(Cell.A7, Cell.A5), is(true));
    }
    /**
     * Test Pawn2.
     * Проверяет движение пешки.
     */
    @Test
    public void whenPawnMuwThenTrue() {
        Pawn pawn = new Pawn(Cell.A7);
        Board figure = new Board();
        figure.add(pawn);
        assertThat(figure.move(Cell.A7, Cell.A6), is(true));
    }
    /**
     * Test Pawn3.
     * Проверяет движение пешки.
     */
    @Test
    public void whenPawnMuwThenFalse() {
        Pawn pawn = new Pawn(Cell.A7);
        Board figure = new Board();
        figure.add(pawn);
        assertThat(figure.move(Cell.A7, Cell.A4), is(false));
    }
    /**
     * Test Pawn4.
     * Проверяет движение пешки.
     */
    @Test
    public void whenPawnMuwBackThenFalse() {
        Pawn pawn = new Pawn(Cell.A5);
        Board figure = new Board();
        figure.add(pawn);
        assertThat(figure.move(Cell.A5, Cell.A6), is(false));
    }
}
