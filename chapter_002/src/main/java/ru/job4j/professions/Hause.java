package ru.job4j.professions;
/**
 * Hause.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Hause extends Engineer {
    public Hause() {
        this.name = "TRC";
        this.plane = "plan";
    }
    Engineer engineer = new Engineer(plane);
    String engineername = engineer.getName();
    String wol = engineer.build();
}
