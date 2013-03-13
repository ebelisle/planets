DROP TABLE IF EXISTS planet;
CREATE TABLE planet(
  id INT IDENTITY, 
  name VARCHAR(255) NOT NULL,
  moons INT NOT NULL,
  hasRings BOOLEAN NOT NULL,
  earthYears FLOAT NOT NULL,
  earthDiameter FLOAT NOT NULL,
  earthMass FLOAT NOT NULL);
