package ru.job4j.tracker;
/**
 * Item.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 30.03.2018
 */
public class Item {
    private String name;
    private String id;
    private String desc;
    private Long created;
    private String comments;
    public Item(String name, String desc, Long created) {
        this.name = name;
        this.desc = desc;
        this.created = created;
    }
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.desc;
    }
    public Long getCreated() {
        return this.created;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getComments() {
        return comments;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
}
