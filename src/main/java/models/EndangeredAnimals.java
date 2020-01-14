package models;

import java.util.List;
import java.util.Objects;
import org.sql2o.Connection;

public class EndangeredAnimals {
    private int animals_id;
    private String animals_name;
    private String animals_health;
    private int animals_age;
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
    public int getAnimals_age() {
        return animals_age;
    }

    public void setAnimals_age(int animals_age) {
        this.animals_age = animals_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EndangeredAnimals)) return false;
        EndangeredAnimals that = (EndangeredAnimals) o;
        return getAnimals_id() == that.getAnimals_id() &&
                getId() == that.getId() &&
                getAnimals_age() == that.getAnimals_age() &&
                getAnimals_name().equals(that.getAnimals_name()) &&
                getAnimals_health().equals(that.getAnimals_health());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnimals_id(), getAnimals_name(), getAnimals_health(), getAnimals_age(), getId());
    }
    public void saveAnimals(EndangeredAnimals endangeredAnimals) {
        try (Connection conn = Database.sql2o.open()) {
            String sql = "INSERT INTO  endangered_animals(animal_name, animal_age, animal_health ) VALUES (:animal_name, :animal_age,:animal_health);";
            this.id = (int) conn.createQuery(sql, true)
                    .addParameter("animal_name", this.animals_name)
                    .addParameter("animal_age", this.animals_age)
                    .addParameter("animal_health", this.animals_health)
                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<EndangeredAnimals> getAllAnimals() {
        try(Connection conn = Database.sql2o.open()){
            String sql = "SELECT * FROM endangered_animals ORDER BY id DESC;";
            return conn.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(EndangeredAnimals.class);
        }
    }
}
