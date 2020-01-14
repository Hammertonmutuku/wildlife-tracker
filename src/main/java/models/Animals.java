package models;

import java.sql.Connection;
import java.util.Objects;


public class Animals {
    private int animals_id;
    private String animals_name;
    private String animals_health;
    private int animals_age;

    public Animals(int id, String name) {
        this.animals_id = animals_id;
        this.animals_name = animals_name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAnimals_id() == animals.getAnimals_id() &&
                getAnimals_age() == animals.getAnimals_age() &&
                getAnimals_name().equals(animals.getAnimals_name()) &&
                getAnimals_health().equals(animals.getAnimals_health());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getAnimals_id(), getAnimals_name(),getAnimals_health(), getAnimals_age());
    }

    @Override
    public void saveAnimals(Animals animals) {
        try (Connection conn =)
    }
}

