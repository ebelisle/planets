package com.bellobjects.planets.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planet {
    @Id public int id;
    public String name;
    public int moons;
    public boolean hasRings;
    public Double earthYears;
    public Double earthDiameter;
    public Double earthMass;
}
