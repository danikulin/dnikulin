package ru.job4j.psevdo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * PaintTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.3
 * @since 14.04.2018
 */
public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    /**
     * loadOutput.
     * Переводит вывод в консоль в байт массив перед началом теста.
     */
    @Before
    public void loadOutput() {
        System.out.println("Execute before metod");
        System.setOut(new PrintStream(this.out));
    }
    /**
     * backOutput.
     * Возвращает вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Execute after metod");
    }
    /**
     * Test Paint.
     * Проверяет вывод квадрата в консоль.
     */
    @Test
    public void whenDrawSquare() {
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
    }
    /**
     * Test Paint.
     * Проверяет вывод треугольника в консоль.
     */
    @Test
    public void whenDrawTreangle() {
        new Paint().draw(new Treangle());
        assertThat(new String(out.toByteArray()), is((new StringBuilder().append("  +  ")
                .append(System.lineSeparator())
                .append(" + + ")
                .append(System.lineSeparator())
                .append("+++++")
                .append(System.lineSeparator())
                .toString())));
    }
}
