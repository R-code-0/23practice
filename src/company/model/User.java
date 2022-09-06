package company.model;

import company.Gender;

public class User {
    private int id, age;
    private String name;
    private Gender gender;

    public User(int id, int age, String name, Gender gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User id=%d age=%d mame=%s gender=%s".formatted(id, age, name, gender);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
