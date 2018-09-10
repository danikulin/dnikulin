package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * KingTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class KingTest {
    /**
     * Test King1.
     * Проверяет движение короля.
     */
    @Test
    public void whenKingMuwThenTrue() {
        King king = new King(Cell.E8);
        Board figure = new Board();
        figure.add(king);
        assertThat(figure.move(Cell.E8, Cell.E7), is(true));
    }
    /**
     * Test King2.
     * Проверяет движение короля.
     */
    @Test
    public void whenKingMuwBackThenTrue() {
        King king = new King(Cell.E7);
        Board figure = new Board();
        figure.add(king);
        assertThat(figure.move(Cell.E7, Cell.D8), is(true));
    }
    /**
     * Test King3.
     * Проверяет движение короля.
     */
    @Test
    public void whenKingMuwThenFalse() {
        King king = new King(Cell.E7);
        Board figure = new Board();
        figure.add(king);
        assertThat(figure.move(Cell.E7, Cell.A8), is(false));
    }
}
