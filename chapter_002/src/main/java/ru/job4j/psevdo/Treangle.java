package ru.job4j.psevdo;
/**
 * Treangle.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 14.04.2018
 */
public class Treangle implements Shape {
    /**
     * Метод draw.
     * Рисует треугольник.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String ln = System.lineSeparator();
        pic.append("  +  ");
        pic.append(ln);
        pic.append(" + + ");
        pic.append(ln);
        pic.append("+++++");
        return pic.toString();
    }
}
