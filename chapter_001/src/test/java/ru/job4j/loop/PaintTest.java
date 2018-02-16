package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 17.02.2018
 */
public class PaintTest {
    /**
     * Test rightTrl.
     * Проверяет построение правой части пирамиды.
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }
    /**
     * Test leftTrl.
     * Проверяет построение левой части пирамиды.
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }
    /**
     * Test piramid.
     * Проверяет построение пирамиды.
     */
    @Test
    public void whenPyramid() {
        Paint paint = new Paint();
        String rst = paint.piramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}