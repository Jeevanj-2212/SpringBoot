package com.sample.user;

import java.time.LocalDate;

public class User {

    private int id;
    private String name;
    private LocalDate birthddate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthddate() {
        return birthddate;
    }

    public void setBirthddate(LocalDate birthddate) {
        this.birthddate = birthddate;
    }

    public User(int id, String name, LocalDate birthddate) {
        super();
        this.id = id;
        this.name = name;
        this.birthddate = birthddate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthddate=" + birthddate +
                '}';
    }
}
