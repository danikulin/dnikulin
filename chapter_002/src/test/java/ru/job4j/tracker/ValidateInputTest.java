package ru.job4j.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * ValidateInputTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 18.05.2018
 */
public class ValidateInputTest {
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput1() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"invalid", "1"}));
        input.ask("Выберете пункт меню: ", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Вы ввели несуществующий пункт меню.%n")
                )
        );
    }
}
