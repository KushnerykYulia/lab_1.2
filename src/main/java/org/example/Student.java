package org.example;

public class Student {
    private String name;
    private String surname;
    private String group;

    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
