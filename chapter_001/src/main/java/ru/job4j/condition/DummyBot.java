package ru.job4j.condition;
/**
 * DummyBot.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 06.02.2018
 */
public class DummyBot {
    /**
     * Метод answer.
     * Отвечает на вопросы.
     * @param question вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос";
        if ("Привет, Бот" .equals(question)) {
            rsl = "Привет, Умник";
        } else if ("Пока" .equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }
}