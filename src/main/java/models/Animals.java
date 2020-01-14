package models;

import java.time.LocalDateTime;

public class Animals {
    private int animals_id;
    private String animals_name;
    private String animals_health;
    private int animals_age;

    public Animals(int id, String name) {
        this.animals_id = animals_id;
        this.animals_name = animals_name;
        this.id = 0;
    }

    public static  Animals setupNewAnimals() {
        return new Animals(1,"lion");
    }

    public int getAnimals_id() {
        return animals_id;
    }

    public void setAnimals_id(int animals_id) {
        this.animals_id = animals_id;
    }

    public String getAnimals_name() {
        return animals_name;
    }

    public void setAnimals_name(String animals_name) {
        this.animals_name = animals_name;
    }

    public String getAnimals_health() {
        return animals_health;
    }
    public void setAnimals_health(String animals_health) {
        this.animals_health = animals_health;
    }

    public int getAnimals_age() {
        return animals_age;
    }
    public void setAnimals_age(int animals_age) {
        this.animals_age = animals_age;
    }


}

