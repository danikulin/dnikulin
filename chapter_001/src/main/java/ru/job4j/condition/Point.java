package ru.job4j.condition;
/**
 * Point.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 04.02.2018
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Метод distanceTo.
     * Принимает точку a и возвращает расстояние до точки b.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2)
        );
    }
    /**
     * Метод main.
     * Задаёт координаты точек a и b.
     * Выводит в консоль заданные координаты и расстояние между точками a и b.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("X1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("X2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние от точки a до точки b = " + result);
    }
}