package ru.job4j.chess;
/**
 * Figur.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.06.2018
 */
public abstract class Figur {
    final Cell position;
    public Figur(final Cell position) {
        this.position = position;
    }
    /**
     * Метод way.
     * Проверяет логику движения фигуры.
     * @param source начальное положение фигуры.
     * @param dest куда фигура должна пойти.
     * @return массив ячеек которые должна пройти фигура.
     */
    abstract Cell[] way(Cell source, Cell dest);
    /**
     * Метод copy.
     * Копирует фигуру в заданную ячейку.
     * @param dest куда должна быть скопирована фигура.
     * @return Фигуру с позицией dest.
     */
    abstract Figur copy(Cell dest);
}
