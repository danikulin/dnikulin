package ru.job4j.bank;
/**
 * Account.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 27.09.2018
 */

public class Account {

    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }
    public double getValues() {
        return this.value;
    }
    public String getRequisites () {
        return this.requisites;
    }
/**
    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.values && destination != null) {
            success = true;
            this.values -= amount;
            destination.values += amount;
        }
        return success;
    }

    public String toString() {
        String otvet;
        otvet = "Account{" + "values=" + values + ", reqs='" + reqs + "\\" + "}";
        return otvet;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        return this.reqs.equals(account.reqs);
    }

    public int hashCode() {
        return this.reqs.hashCode();
    }
 */
}