package ru.job4j.loop;
/**
 * Paint.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 17.02.2018
 */
public class Paint {
    /**
     * Метод rightTrl.
     * Рисует правую часть пирамиды.
     * @param height высота пирамиды.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int range = 0; range != height; range++) {
            for (int column = 0; column != width; column++) {
                if (column <= range) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            } screen.append(System.lineSeparator());
        } return screen.toString();
    }
    /**
     * Метод leftTrl.
     * Рисует левую часть пирамиды.
     * @param height высота пирамиды.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int range = 0; range != height; range++) {
            for (int column = 0; column != width; column++) {
                if (range >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            } screen.append(System.lineSeparator());
        } return screen.toString();
    }
    /**
     * Метод piramid.
     * Рисует пирамиду.
     * @param h высота пирамиды.
     */
    public String piramid(int h) {
        StringBuilder screen = new StringBuilder();
        int widts = h * 2 - 1;
        for (int range = 0; range != h; range++) {
            for (int column = 0; column != widts; column++) {
                if (range >= h - column - 1 && range + h - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            } screen.append(System.lineSeparator());
        } return screen.toString();
    }

}
