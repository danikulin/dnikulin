package ru.job4j.tracker;
/**
 * UserAction.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 22.04.2018
 */
public interface UserAction {
    /**
     * Метод key.
     * Возвращает номер выбранного действия.
     */
    int key();
    /**
     * Метод execute.
     * Выполняет выбранное действие.
     */
    void execute(Input input, Tracker tracker);
    /**
     * Метод info.
     * Печатает что делает выбранное действие.
     */
    String info();
}
