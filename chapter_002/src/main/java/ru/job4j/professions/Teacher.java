package ru.job4j.professions;
/**
 * Teacher.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Teacher extends Profession {
    public String zachet;
    public Teacher() {
        this.name = "Ban";
    }
    /**
     * @return zachet.
     */
    public String teach(String name) {
        return zachet;
    }
}
