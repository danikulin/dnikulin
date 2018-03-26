package ru.job4j.professions;
/**
 * Engineer.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Engineer extends Profession {
    public String wol;
    public String plane;
    public Engineer(){
    }
    public Engineer(String plan) {
        this.name = "Jon";
        this.plane = plan;
    }
    /**
     * @return wol.
     */
    public String build() {
        return wol;
    }
}
