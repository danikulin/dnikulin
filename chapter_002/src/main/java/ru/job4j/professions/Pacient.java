package ru.job4j.professions;
/**
 * Pacient.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Pacient extends Doctor {
    public Pacient() {
        this.name = "Jon";
        this.simptoms = "simptom";
    }
    Doctor doc = new Doctor(simptoms);
    String namedoc = doc.getName();
    String diagnos = doc.medicate();
}
