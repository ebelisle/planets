package com.bellobjects.planets;

import org.testng.annotations.Test;

@Test
public class SampleTest {

    public void goodTest() {
        org.springframework.util.Assert.isTrue(true, "Not True");
        org.testng.Assert.assertTrue(true, "Not True");
        junit.framework.Assert.assertTrue(true);
        org.junit.Assert.assertTrue("Not True", true);
        org.testng.AssertJUnit.assertTrue("Not True", true);
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void badOrgSpringframeworkUtilAssertTest() {
        org.springframework.util.Assert.isTrue(false, "Not True");
    }

    @Test(expectedExceptions = java.lang.AssertionError.class)
    public void badOrgTestngAssertTest() {
        org.testng.Assert.assertTrue(false, "Not True");
    }

    @Test(expectedExceptions = junit.framework.AssertionFailedError.class)
    public void badJunitFrameworkAssertTest() {
        junit.framework.Assert.assertTrue(false);
    }

    @Test(expectedExceptions = java.lang.AssertionError.class)
    public void badOrgJAssertTest() {
        org.junit.Assert.assertTrue("Not True", false);
    }

    @Test(expectedExceptions = java.lang.AssertionError.class)
    public void badOrgTestngAssertJUnitTest() {
        org.testng.AssertJUnit.assertTrue("Not True", false);
    }
    
    private int state = 0;

    public void state0() {
        org.testng.Assert.assertEquals(0, state++);
    }

    @Test(dependsOnMethods = "state0")
    public void state1() {
    }

    @Test(dependsOnMethods = "badJunitFrameworkAssertTest")
    public void dependantJunitFrameworkAssertTest() {
    }

    @Test(dependsOnMethods = "badOrgJAssertTest")
    public void dependantOrgJAssertTest() {
    }

    @Test(dependsOnMethods = "badOrgTestngAssertJUnitTest")
    public void dependantOrgTestngAssertJUnitTest() {
    }

    public void runtimeFailingTest() {
        throw new RuntimeException("Intentional Runtime Exception");
    }

    public boolean ignoredTest() {
        throw new RuntimeException("methods with return values are not tests");
    }

    public void includedTest() {
        
    }
}
