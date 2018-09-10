package ru.job4j.chess;

/**
 * Pawn.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.06.2018
 */
public class Pawn extends Figur {
    public Pawn(Cell position) {
        super(position);
    }
    /**
     * Метод way.
     * Проверяет логику движения пешки.
     * @param source начальное положение пешки.
     * @param dest куда пешка должна пойти.
     * @return массив ячеек которые должна пройти пешка.
     */
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (source.y == 6 && source.y == dest.y + 2 && source.x == dest.x) {
            steps = new Cell[2];
            steps[1] = dest;
            for (Cell cell : Cell.values()) {
                if (cell.x == source.x && cell.y == source.y - 1) {
                    steps[0] = cell;
                }
            }
        }
        if (source.y == dest.y + 1 && source.x == dest.x) {
            steps = new Cell[] {dest};
        }
        return steps;
    }
    /**
     * Метод copy.
     * Копирует пешку в заданную ячейку.
     * @param dest куда должна быть скопирована пешка.
     * @return Фигуру пешка с позицией dest.
     */
    public Figur copy(Cell dest) {
        return new Pawn(dest);
    }
}
