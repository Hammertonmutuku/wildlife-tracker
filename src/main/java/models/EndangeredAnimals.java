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

}
