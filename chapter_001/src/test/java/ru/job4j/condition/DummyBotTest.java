package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.02.2018
 */
public class DummyBotTest {
    /**
     * Test answer1.
     * Проверяет ответ на "Привет, Бот"
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Привет, Бот"),
                is("Привет, Умник")
        );
    }
    /**
     * Test answer2.
     * Проверяет ответ на "Пока"
     */
    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Пока"),
                is("До скорой встречи")
        );
    }
    /**
     * Test answer3.
     * Проверяет ответ на незнакомый боту вопрос.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос")
        );
    }
}
