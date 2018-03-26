package ru.job4j.professions;
/**
 * Doctor.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Doctor extends Profession {
    public String diagnos;
    public String simptoms;
    public Doctor() {
    }
    public Doctor(String simptom) {
        this.name = "Pitr";
        this.simptoms = simptom;
    }
    /**
     * @return diagnos.
     */
    public String medicate() {
        return diagnos;
    }
}
