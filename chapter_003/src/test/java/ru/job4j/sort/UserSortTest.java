package ru.job4j.sort;

import org.junit.Test;
import java.util.Arrays;
import java.util.TreeSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * UserSortTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
public class UserSortTest {
    /**
     * Test sort.
     * Проверяет, что первый элемент TreeSet пользователей, соответствует наименьшиму по возрасту.
     */
    @Test
    public void whenNotSortListThenSortSet() {
        UserSort usort = new UserSort();
        TreeSet<User> result = usort.sort(Arrays.asList(new User("Pitr", 20), new User("Ivan", 18), new User("Jon", 19)));
        assertThat(result.first().getName(), is("Ivan"));
    }
}
