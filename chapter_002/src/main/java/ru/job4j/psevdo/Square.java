package ru.job4j.psevdo;
/**
 * Square.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 14.04.2018
 */
public class Square implements Shape {
    /**
     * Метод draw.
     * Рисует квадрат.
     */
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String ln = System.lineSeparator();
        pic.append("+++++++");
        pic.append(ln);
        pic.append("+     +");
        pic.append(ln);
        pic.append("+     +");
        pic.append(ln);
        pic.append("+++++++");
        return pic.toString();
    }
}
