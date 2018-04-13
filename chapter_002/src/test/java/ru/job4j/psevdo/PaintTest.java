package ru.job4j.psevdo;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * PaintTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 14.04.2018
 */
public class PaintTest {
    /**
     * Test Paint.
     * Проверяет вывод квадрата в консоль.
     */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        String ln = System.lineSeparator();
        assertThat(new String(out.toByteArray()), is(new StringBuilder().append("+++++++")
                .append(ln)
                .append("+     +")
                .append(ln)
                .append("+     +")
                .append(ln)
                .append("+++++++")
                .append(ln)
                .toString()));
        System.setOut(stdout);
    }
}
