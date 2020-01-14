package models;

public class EndangeredAnimals {
    private int animals_id;
    private String animals_name;
    private String animals_health;
    private String animals_age;
    private int id;

    public EndangeredAnimals(String animal_name,String animal_health, String animal_age ){
        this.animals_name = animal_name;
        this.animals_health = animal_health;
        this.animals_age = animal_age;
        this.id = 1;
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
    public String getAnimals_age() {
        return animals_age;
    }

    public void setAnimals_age(String animals_age) {
        this.animals_age = animals_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
