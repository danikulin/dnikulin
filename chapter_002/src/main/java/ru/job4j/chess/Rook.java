package ru.job4j.chess;
/**
 * Rook.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 13.06.2018
 */
public class Rook extends Figur {
    public Rook(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения ладьи.
     * @param source начальное положение ладьи.
     * @param dest куда ладья должна пойти.
     * @return массив ячеек которые должна пройти ладья.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        int deltax = dest.x - source.x;
        int deltay = dest.y - source.y;
        if (Math.abs(deltax) != 0 && deltay == 0) {
            steps = new Cell[Math.abs(deltax)];
            for (int i = 1; i <= steps.length; i++) {
                for (Cell cell : Cell.values()) {
                    if (deltax > 0 && cell.x == source.x + i && cell.y == source.y) {
                        steps[i - 1] = cell;
                    }
                    if (deltax < 0 && cell.x == source.x - i && cell.y == source.y) {
                        steps[i - 1] = cell;
                    }
                }
            }
        }
        if (deltax == 0 && Math.abs(deltay) != 0) {
            steps = new Cell[Math.abs(deltay)];
            for (int i = 1; i <= steps.length; i++) {
                for (Cell cell : Cell.values()) {
                    if (deltay > 0 && cell.x == source.x && cell.y == source.y + i) {
                        steps[i - 1] = cell;
                    }
                    if (deltay < 0 && cell.x == source.x && cell.y == source.y - i) {
                        steps[i - 1] = cell;
                    }
                }
            }
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует ладью в заданную ячейку.
     * @param dest куда должна быть скопирована ладья.
     * @return Фигуру ладья с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new Rook(dest);
    }
}
