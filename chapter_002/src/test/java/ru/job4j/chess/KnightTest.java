package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * KnightTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class KnightTest {
    /**
     * Test Knight1.
     * Проверяет движение коня.
     */
    @Test
    public void whenKnightMuwThenTrue() {
        Knight knight = new Knight(Cell.B8);
        Board figure = new Board();
        figure.add(knight);
        assertThat(figure.move(Cell.B8, Cell.A6), is(true));
    }
    /**
     * Test Knight2.
     * Проверяет движение коня.
     */
    @Test
    public void whenKnightMuw2ThenTrue() {
        Knight knight = new Knight(Cell.A6);
        Board figure = new Board();
        figure.add(knight);
        assertThat(figure.move(Cell.A6, Cell.C7), is(true));
    }
    /**
     * Test Knight3.
     * Проверяет движение коня.
     */
    @Test
    public void whenKnightMuwThenFalse() {
        Knight knight = new Knight(Cell.A6);
        Board figure = new Board();
        figure.add(knight);
        assertThat(figure.move(Cell.A6, Cell.C8), is(false));
    }
    /**
     * Test Knight4.
     * Проверяет что конь перепрыгивает фигуру.
     */
    @Test
    public void whenKnightMuwByFigureThenTrue() {
        Knight knight = new Knight(Cell.B8);
        Pawn pawn = new Pawn(Cell.B7);
        Board figure = new Board();
        figure.add(knight);
        figure.add(pawn);
        assertThat(figure.move(Cell.B8, Cell.A6), is(true));
    }
}
