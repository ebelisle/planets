package com.bellobjects.planets;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.bellobjects.planets.config.TestConfiguration;

@ContextConfiguration(classes = { TestConfiguration.class })
public class SpringH2Test extends AbstractJUnit4SpringContextTests {

	@Test
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
