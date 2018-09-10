package ru.job4j.chess;
/**
 * Board.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.06.2018
 */
public class Board {
    /**
     * Массив фигур.
     */
    private final Figur[] figures = new Figur[32];
    private int index = 0;
    /**
     * Метод add.
     * Добавляет фигуру в массив фигур.
     * @param figur фигура которую надо добавить.
     */
    public void add(Figur figur) {
        this.figures[this.index++] = figur;
    }
    /**
     * Метод move.
     * Проверяет может ли фигура совершить ход.
     * Проверяет есть ли фигура в начальном положении, занят ли путь другими фигурами.
     * @param source начальное положение фигуры.
     * @param dest куда фигура должна пойти.
     * @return логическое значение.
     */
    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (steps.length > 0 && steps[steps.length - 1].equals(dest) && this.findBy(dest) == -1) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
                for (int i = 0; i != steps.length - 1; i++) {
                    if (this.findBy(steps[i]) != -1) {
                        rst = false;
                        this.figures[index] = this.figures[index].copy(source);
                        break;
                    }
                }
            }
        }
        return rst;
    }
    /**
     * Метод findBy.
     * Проверяет есть ли фигура в заданной ячейке шахматной доски.
     * @param cell координата заданной ячейки шахматной доски.
     * @return -1 если ячейка не занята фигурой, index фигуры в массиве фигур которая находится в заданной ячейке.
     */
    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position.equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
