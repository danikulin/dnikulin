package ru.job4j.tracker;
/**
 * StubInput.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.04.2018
 */
public class StubInput implements Input {
    /**
     * value Массив для команд эмулирующих поведение пользователя.
     */
    private final String[] value;
    /**
     * position ля подсчета количества обращений к методу ask.
     */
    private int position;
    /**
     * Конструктор StubInput.
     * @param value Массив для команд эмулирующих поведение пользователя.
     */
    public StubInput(String[] value) {
        this.value = value;
    }
    /**
     * Реализация метода ask.
     * Эмулирует диалог с пользователем.
     * @param question вопрос к пользователю.
     * @return ответ пользователя.
     */
    @Override
    public String ask(String question) {
        return this.value[position++];
    }
}
