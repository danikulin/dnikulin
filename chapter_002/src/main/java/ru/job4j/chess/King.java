package ru.job4j.chess;
/**
 * King.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 09.06.2018
 */
public class King extends Figur {
    public King(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения короля.
     * @param source начальное положение короля.
     * @param dest куда король должен пойти.
     * @return массив ячеек которые должен пройти король.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        int deltax = Math.abs(dest.x - source.x);
        int deltay = Math.abs(dest.y - source.y);
        if (deltax == 1 && deltay == 1 || deltax == 1 && deltay == 0 || deltax == 0 && deltay == 1) {
            steps = new Cell[]{dest};
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует короля в заданную ячейку.
     * @param dest куда должен быть скопирован король.
     * @return Фигуру король с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new King(dest);
    }
}
