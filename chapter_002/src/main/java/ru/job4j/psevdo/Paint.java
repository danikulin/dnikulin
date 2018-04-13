package ru.job4j.psevdo;
/**
 * Paint.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 14.04.2018
 */
public class Paint {
    /**
     * Метод draw.
     * Выводит в консоль прорисованную фигуру.
     * @param shape фигура которую надо вывести в консоль.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Treangle());
        paint.draw(new Square());
    }
}
