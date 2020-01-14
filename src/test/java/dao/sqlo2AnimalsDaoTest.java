package dao;

import models.Animals;
import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

//public class Sql2oAnimalsDaoTest {
  //  private Sql2oAnimalskDao animalsDao; //ignore me for now. We'll create this soon.
    private Connection conn; //must be sql2o class conn

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        //animalsDao = new Sql2oAnimalskDao(sql2o); //ignore me for now
        conn = sql2o.open(); //keep connection open through entire test so it does not get erased
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }
}