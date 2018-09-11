package ru.job4j.search;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * UserConvertTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.09.2018
 */
public class UserConvertTest {
    /**
     * Test process.
     * Проверяет перевод листа Users в Map.
     */
    @Test
    public void whenListNameThanMapName() {
        UserConvert uk = new UserConvert();
        List<Users> input = new ArrayList<>();
        input.add(new Users(1, "Dima", "Moscow"));
        input.add(new Users(2, "Pitr",  "Brynsk"));
        HashMap<Integer, Users> result = uk.process(input);
        assertThat(result.get(1).getName(), is("Dima"));
    }
    /**
     * Test process.
     * Проверяет перевод листа Users в Map.
     */
    @Test
    public void whenListCityThanMapCity() {
        UserConvert uk = new UserConvert();
        List<Users> input = new ArrayList<>();
        input.add(new Users(1, "Dima", "Moscow"));
        input.add(new Users(2, "Pitr",  "Brynsk"));
        HashMap<Integer, Users> result = uk.process(input);
        assertThat(result.get(2).getCity(), is("Brynsk"));
    }
}
