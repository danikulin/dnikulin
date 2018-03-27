package ru.job4j.professions;
/**
 * Engineer.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 27.03.2018
 */
public class Engineer extends Profession {
    public String wol;
    public String plane;
    public Engineer(String name, String plane) {
        this.name = name;
        this.plane = plane;
    }
    /**
     * @return wol.
     */
    public String build() {
        return wol;
    }
}
