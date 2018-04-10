package ru.job4j.tracker;
import java.util.Scanner;
/**
 * ConsolInput.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.04.2018
 */
public class ConsolInput implements Input {
  private Scanner scanner = new Scanner(System.in);
    /**
     * Реализация метода ask.
     * Осуществляет диалог с пользователем.
     * @param question вопрос пользователю.
     * @return ответ пользователя.
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
