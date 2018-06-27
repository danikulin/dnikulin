package ru.job4j.chess;

/**
 * Bishop.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.06.2018
 */
public class Bishop extends Figur {

    public Bishop(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения Слона.
     * @param source начальное положение Слона.
     * @param dest куда Слон должен пойти.
     * @return массив ячеек которые должен пройти Слон.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        int deltax = dest.x - source.x;
        int deltay = dest.y - source.y;
        if (Math.abs(deltay) == Math.abs(deltax)) {
            steps = new Cell[Math.abs(dest.x - source.x)];
            if (deltax > 0 && deltay > 0) {
                for (int i = 1; i <= steps.length; i++) {
                    for (Cell cell : Cell.values()) {
                        if (cell.x == source.x + i && cell.y == source.y + i) {
                            steps[i - 1] = cell;
                        }
                    }
                }
            }
            if (deltax < 0 && deltay > 0) {
                for (int i = 1; i <= steps.length; i++) {
                    for (Cell cell : Cell.values()) {
                        if (cell.x == source.x - i && cell.y == source.y + i) {
                            steps[i - 1] = cell;
                        }
                    }
                }
            }
            if (deltax > 0 && deltay < 0) {
                for (int i = 1; i <= steps.length; i++) {
                    for (Cell cell : Cell.values()) {
                        if (cell.x == source.x + i && cell.y == source.y - i) {
                            steps[i - 1] = cell;
                        }
                    }
                }
            }
            if (deltax < 0 && deltay < 0) {
                for (int i = 1; i <= steps.length; i++) {
                    for (Cell cell : Cell.values()) {
                        if (cell.x == source.x - i && cell.y == source.y - i) {
                            steps[i - 1] = cell;
                        }
                    }
                }
            }
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует Слона в заданную ячейку.
     * @param dest куда должен быть скопирован Слон.
     * @return Фигуру Слон с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new Bishop(dest);
    }
}