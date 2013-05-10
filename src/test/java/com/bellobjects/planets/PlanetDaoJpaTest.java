package com.bellobjects.planets;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.bellobjects.planets.config.TestConfiguration;
import com.bellobjects.planets.dao.PlanetDao;
import com.bellobjects.planets.model.Planet;

@ContextConfiguration(classes={TestConfiguration.class})
@Test
public class PlanetDaoJpaTest extends AbstractTestNGSpringContextTests {
	
    @Autowired(required=true)
    private PlanetDao planetDao;
    
    @Autowired
    private @Value("${planet.home}") String homePlanet;

	public void CountPlanetsTest() {
	    Collection<Planet> planets = planetDao.getPlanets();
	    
	    Collection<String> planetNames = new HashSet<>();
	    for (Planet planet : planets) {
            planetNames.add(planet.name);
        }
	}
}
