package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void NewAnimalObjectCorrectlyCreated_true() throws Exception {
        Animals animals = setupNewAnimals();
        assertEquals(true, animals instanceof Animals);
    }

    @Test
    public void AnimalNameCorrectlyCreated_true() throws Exception {
        Animals animals = setupNewAnimals();
        assertEquals(true, animals.getName());
    }
    @Test
    public void isCompletedPropertyIsFalseAfterInstantiation() throws Exception {
        Animals animals = setupNewAnimals();
        assertEquals(false, animals.getEndangered()); //should never start as completed
    }

    @Test
    public void getCreatedAtInstantiatesWithCurrentTimeToday() throws Exception {
        Animals animals = setupNewAnimals();
        assertEquals(LocalDateTime.now().getDayOfWeek(),animals.getCreatedAt().getDayOfWeek());
    }

    //helper methods
    public Animals setupNewAnimals(){
        return new Animals("Mow the lawn");
    }

    @After
    public void tearDown() throws Exception {
    }
}