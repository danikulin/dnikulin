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
        int posx = source.x;
        int posy = source.y;
        int deltax = dest.x - source.x;
        int deltay = dest.y - source.y;
        if (Math.abs(deltay) == Math.abs(deltax)) {
            int xmove = 0;
            if (deltax > 0) {
                xmove = 1;
            } else if (deltax < 0) {
                xmove = -1;
            }
            int ymove = 0;
            if (deltay > 0) {
                ymove = 1;
            } else if (deltay < 0) {
                ymove = -1;
            }
            steps = new Cell[Math.abs(deltax) + 1];
            /**
             for (int i = 0; i <= steps.length - 1; i++) {
             steps[i] = new Cell(posx, posy);
             posx += xmove;
             posy += ymove;
             }
             */
            for (int i = 0; i <= steps.length - 1; i++) {
                for (Cell cell : Cell.values()) {
                    if (cell.x == posx && cell.y == posy) {
                        steps[i] = cell;
                        posx += xmove;
                        posy += ymove;
                        break;
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