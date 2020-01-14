package interfaces;
 import models.Animals;

 import  java.util.List;

public interface AnimalsInterface {
    void saveAnimals(Animals animals);
    Animals findById(int id);
}