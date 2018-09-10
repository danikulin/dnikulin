package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 22.01.2018
 */
	public class CalculateTest {
		/**
		* Test echo.
		*/@Test
		public void whenTakeNameThenTreeEchoPlusName() {
			String input = "nikulin";
			String expect = "Echo, echo, echo : nikulin";
			Calculate calc = new Calculate();
			String result = calc.echo(input);
			assertThat(result, is(expect));
		}
	}