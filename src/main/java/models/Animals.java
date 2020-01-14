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
}

