package models;

public class EndangeredAnimals {
    private int animal_id;
    private String animal_name;
    private String animal_health;
    private String animal_age;
    private int id;

    public EndangeredAnimals(String animal_name,String animal_health, String animal_age ){
        this.animal_name = animal_name;
        this.animal_health = animal_health;
        this.animal_age = animal_age;
        this.id = 1;
    }
    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_health() {
        return animal_health;
    }
    public String getAnimal_age() {
        return animal_age;
    }

    public void setAnimal_age(String animal_age) {
        this.animal_age = animal_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
