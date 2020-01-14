package models;

import java.time.LocalDateTime;

public class Animals {
    private int id;
    private String name;
    private String health;
    private String age;
    private LocalDateTime createdAt;

    public Animals(int id, String name) {
        this.id = id;
        this.name = name;
        this.id = 0;
    }

    public static  Animals setupNewAnimals() {
        return new Animals(1,"lion");
    }

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

    public String getHealth() {
        return health;
    }
    public void setHealth(String health) {
        this.health = health;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }


}

