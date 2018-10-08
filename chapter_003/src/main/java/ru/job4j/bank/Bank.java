package ru.job4j.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Bank.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.10.2018
 */
public class Bank {

    private TreeMap<User, ArrayList<Account>> treemap = new TreeMap<>();

    /**
     * Метод addUser.
     *Добавляет нового пользователя в мап хранилище.
     * @param user пользователь которого надо добавить.
     */
    public void addUser(User user) {
        this.treemap.put(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        this.treemap.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        this.treemap.get(user).add(account);
    }

    //private Account getActualAccount(User user, Account account) {
   //     ArrayList<Account> list = this.treemap.get(user);
   //     return list.get(list.indexOf(account));
   // }

    public void deleteAccountFromUser(String passport, Account account) {
        this.treemap.get(user).remove(account);
    }

    public List<Account> getUserAccounts(String passport) {
        return this.treemap.get(user);
    }

    public boolean transferMany(String srcPassport, String srcRequisites, String destPassport, String destRequisites, double amount) {
        return this.treemap.get(user1).contains(account1)
                && this.treemap.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }

    //public String toString() {
      //  return "Bank{" + "accounts=" + treemap + "}";
    //}
}