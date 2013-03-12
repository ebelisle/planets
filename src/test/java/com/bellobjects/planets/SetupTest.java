package com.bellobjects.planets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bellobjects.planets.config.MainConfiguration;

@ContextConfiguration(classes={MainConfiguration.class})
@Test
public class SetupTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	private @Value("${planet.home}") String homePlanet;
	
	public void PropertyPlaceholderTest() {
		Assert.assertEquals(homePlanet, "earth");
	}
}
