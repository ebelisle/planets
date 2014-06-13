package com.bellobjects.planets;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.bellobjects.planets.config.TestConfiguration;
import com.bellobjects.planets.dao.PlanetDao;
import com.bellobjects.planets.model.Planet;

@ContextConfiguration(classes={TestConfiguration.class})
public class PlanetDaoJpaTest extends AbstractJUnit4SpringContextTests {
	
    @Autowired(required=true)
    private PlanetDao planetDao;
    
    @Autowired
    private @Value("${planet.home}") String homePlanet;

    @Test
	public void CountPlanetsTest() {
	    Collection<Planet> planets = planetDao.getPlanets();
	    
	    Collection<String> planetNames = new HashSet<>();
	    for (Planet planet : planets) {
            planetNames.add(planet.name);
        }
	}
}
