package ru.job4j.loop;
/**
 * Board.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 15.02.2018
 */
public class Board {
    /**
     * Метод paint.
     * Рисует шахматную доску.
     * @param hight высота доски.
     * @param widts ширина доски.
     */
    public String paint(int widts, int hight) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < widts; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            } screen.append(ln);
        }
        return screen.toString();
    }
}