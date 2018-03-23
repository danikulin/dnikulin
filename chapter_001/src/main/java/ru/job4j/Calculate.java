package ru.job4j;
/**
 * Calculate.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 0.4
 */
public class Calculate {
	/**
	 * Main.
	 * Вывод строки в консоль.
	 * @param args - args.
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
	/**
	 * Method echo.
	 * @param name любое слово.
	 * @return Echo plus принятое слово.
	 */
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}