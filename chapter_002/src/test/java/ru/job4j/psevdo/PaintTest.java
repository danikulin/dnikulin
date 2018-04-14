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
 * @version 1.2
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
        assertThat(new String(out.toByteArray()), is(new StringBuilder().append("+++++++")
                .append(System.lineSeparator())
                .append("+     +")
                .append(System.lineSeparator())
                .append("+     +")
                .append(System.lineSeparator())
                .append("+++++++")
                .append(System.lineSeparator())
                .toString()));
        System.setOut(stdout);
    }
    /**
     * Test Paint.
     * Проверяет вывод треугольника в консоль.
     */
    @Test
    public void whenDrawTreangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Treangle());
        assertThat(new String(out.toByteArray()), is((new StringBuilder().append("  +  ")
                .append(System.lineSeparator())
                .append(" + + ")
                .append(System.lineSeparator())
                .append("+++++")
                .append(System.lineSeparator())
                .toString())));
        System.setOut(stdout);
    }
}
