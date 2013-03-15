package com.bellobjects.planets;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.bellobjects.planets.config.TestConfiguration;

@ContextConfiguration(classes = { TestConfiguration.class })
@Test
public class SpringH2Test extends AbstractTestNGSpringContextTests {

    public void noTest() {

    }

//    private EmbeddedDatabase db;
//
//    @BeforeClass
//    private void initDb() {
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        db = builder.setType(EmbeddedDatabaseType.H2).addDefaultScripts().build();
//    }
//
//    @AfterClass
//    private void stopDb() {
//        db.shutdown();
//    }
}
