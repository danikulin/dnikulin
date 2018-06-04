package ru.job4j.chess;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BoardTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.06.2018
 */
public class BoardTest {
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
    /**
     * Test move1.
     * Проверяет что нельзя шагать через фигуру.
     */
    @Test
    public void whenBishopMuwByFigureThenFalse() {
        Bishop bishop = new Bishop(Cell.A3);
        Bishop bishop2 = new Bishop(Cell.C5);
        Board figure = new Board();
        figure.add(bishop);
        figure.add(bishop2);
        assertThat(figure.move(Cell.A3, Cell.D6), is(false));
    }
    /**
     * Test move2.
     * Проверяет что нельзя поставить одну фигуру на другую.
     */
    @Test
    public void whenBishopMuwOnFigureThenFalse() {
        Bishop bishop = new Bishop(Cell.A3);
        Bishop bishop2 = new Bishop(Cell.D6);
        Board figure = new Board();
        figure.add(bishop);
        figure.add(bishop2);
        assertThat(figure.move(Cell.A3, Cell.D6), is(false));
    }
    /**
     * Test move3.
     * Проверяет что в заданной ячейке есть фигура.
     */
    @Test
    public void whenBishopNonThenMuwFalse() {
        Bishop bishop = new Bishop(Cell.A3);
        Board figure = new Board();
        figure.add(bishop);
        assertThat(figure.move(Cell.B4, Cell.D6), is(false));
    }
}
