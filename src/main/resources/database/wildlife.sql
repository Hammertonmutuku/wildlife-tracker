SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS animals (
  id int PRIMARY KEY auto_increment,
  animals_id int,
  name VARCHAR
  );

CREATE TABLE IF NOT EXISTS endangered_animals(
  id int PRIMARY KEY auto_increment,
  animals_id int,
  animals_name VARCHAR,
  animals_age int,
  animals_health VARCHAR
):

CREATE TABLE IF NOT EXISTS  sightings(
   id int PRIMARY KEY auto_increment,
   animals_id int,
   animals_name VARCHAR,
   animals_location VARCHAR,
   ranger_name VARCHAR,
   created_at TIMESTAMP
); ()


