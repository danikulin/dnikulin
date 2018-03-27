package ru.job4j.professions;
/**
 * Doctor.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 27.03.2018
 */
public class Doctor extends Profession {
    public String diagnos;
    public String simptom;
    public Doctor(String name, String simptom) {
        this.name = name;
        this.simptom = simptom;
    }
    /**
     * @return diagnos.
     */
    public String medicate() {
        return diagnos;
    }
}
