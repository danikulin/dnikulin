package ru.job4j.condition;
/**
 * Triangle.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 08.02.2018
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Метод period.
     * Возвращает полупериметр треугольника abc.
     */
    public double period(double ab, double ac, double bc) {
       return  (ab + ac + bc) / 2;
    }
    /**
    * Метод area.
    * Возвращает площадь треугольника abc.
     * Возвращает -1 если треугольник нельзя построить по заданным точкам.
     */
    public double area() {
        double rls = -1;
        double ab = this.a.distanceTo(b);
        double ac = this.a.distanceTo(c);
        double bc = this.b.distanceTo(c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rls = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rls;
    }
    /**
     * Метод exist.
     * Проверяет можно ли построить треугольник abc.
     */
    public boolean exist(double ab, double ac, double bc) {
             return (ab + bc > ac & ab + ac > bc & bc + ac > ab);
    }
}