package ru.job4j.tracker;
/**
 * BaseAction.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 23.05.2018
 */
public abstract class BaseAction  implements UserAction {
    private final int key;
    private final String name;
    /**
     * Конструктор.
     * @param key номер действия.
     * @param name название действия.
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }
    /**
     * Метод key.
     * Возвращает номер выбранного действия.
     */
    @Override
    public int key() {
        return this.key;
    }
    /**
     * Метод info.
     * Печатает что делает выбранное действие.
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
