package ru.job4j.bank;
/**
 * User.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 27.09.2018
 */
public class User {
    private String name;
    private String passport;
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
