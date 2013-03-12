package com.bellobjects.planets;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bellobjects.planets.config.H2Configuration;
import com.bellobjects.planets.config.MainConfiguration;

@ContextConfiguration(classes = { MainConfiguration.class, H2Configuration.class })
@Test
public class SpringH2Test extends AbstractTestNGSpringContextTests {

    private EmbeddedDatabase db;

    @BeforeClass
    private void initDb() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        db = builder.setType(EmbeddedDatabaseType.H2).addDefaultScripts().build();
    }

    public void noTest() {

    }

    @AfterClass
    private void stopDb() {
        db.shutdown();
    }
}
