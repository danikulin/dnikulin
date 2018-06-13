package ru.job4j.chess;
/**
 * Knight.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class Knight extends Figur {
    public Knight(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения коня.
     * @param source начальное положение коня.
     * @param dest куда конь должен пойти.
     * @return массив ячеек которые должен пройти конь.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        int deltax = Math.abs(dest.x - source.x);
        int deltay = Math.abs(dest.y - source.y);
        if (deltax == 1 && deltay == 2 || deltax == 2 && deltay == 1) {
            steps = new Cell[]{dest};
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует коня в заданную ячейку.
     * @param dest куда должен быть скопирован конь.
     * @return Фигуру конь с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new Knight(dest);
    }
}
