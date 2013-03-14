package com.bellobjects.planets.dao;

import java.util.Collection;

import com.bellobjects.planets.model.Planet;

public interface PlanetDao {

    public abstract Collection<Planet> getPlanets();

}