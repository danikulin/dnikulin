package ru.job4j.chess;
/**
 * Queen.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 13.06.2018
 */
public class Queen extends Figur {
    public Queen(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения королевы.
     * @param source начальное положение королевы.
     * @param dest куда королева должна пойти.
     * @return массив ячеек которые должна пройти королева.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        int deltax = dest.x - source.x;
        int deltay = dest.y - source.y;
        if (Math.abs(deltay) == Math.abs(deltax)) {
            steps = new Bishop(source).way(source, dest);
        }
        if ((Math.abs(deltax) != 0 && deltay == 0) || (deltax == 0 && Math.abs(deltay) != 0)) {
            steps = new Rook(source).way(source, dest);
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует королеву в заданную ячейку.
     * @param dest куда должна быть скопирована королева.
     * @return Фигуру королева с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new Queen(dest);
    }
}
