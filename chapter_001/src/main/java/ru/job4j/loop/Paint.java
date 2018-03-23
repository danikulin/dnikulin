package ru.job4j.loop;
import java.util.function.BiPredicate;
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
        return loopBy(
                height,
                height,
                (range, column) -> range >= column);
    }
    /**
     * Метод leftTrl.
     * Рисует левую часть пирамиды.
     * @param height высота пирамиды.
     */
    public String leftTrl(int height) {
        return loopBy(
                height,
                height,
                (range, column) -> range >= height - column - 1);
    }
    /**
     * Метод piramid.
     * Рисует пирамиду.
     * @param h высота пирамиды.
     */
    public String piramid(int h) {
        return loopBy(
                h,
                2 * h - 1,
                (range, column) -> range >= h - column - 1 && range + h - 1 >= column);
    }
    /**
     * Метод loopBy.
     * Рисует правую, левую и всю пирамиду в зависимости от входящих параметров.
     * @param height высота пирамиды.
     * @param width ширина пирамиды.
     * @param predict условие для построения.
     */
    public String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int range = 0; range != height; range++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(range, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            } screen.append(System.lineSeparator());
        } return screen.toString();
    }
}
