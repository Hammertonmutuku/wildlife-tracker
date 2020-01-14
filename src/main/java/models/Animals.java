package models;

import interfaces.AnimalsInterface;
import org.sql2o.Connection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Animals {
    private int id;
    private String name;
    private String health;
    private String age;
    private LocalDateTime createdAt;

    public Animals(String name, int id) {
        this.id = id;
        this.name = name;
        this.id = 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getEndangered() == animals.getEndangered()&&
                getId() == animals.getId() &&
                Objects.equals(getName(), animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getName(), getId());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean endangered) {
        this.endangered = endangered;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean getEndangered(){
        return this.endangered;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

}


