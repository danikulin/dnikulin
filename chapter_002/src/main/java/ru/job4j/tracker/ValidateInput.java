package ru.job4j.tracker;

public class ValidateInput extends ConsolInput {
    public int ask(String question, int[] rang) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, rang);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Вы ввели несуществующий пункт мею.");
            } catch (MenuOutException moe) {
                System.out.println("Вы ввели несуществующий пункт мею.");
            }
        } while (invalid);
        return value;
    }
}
