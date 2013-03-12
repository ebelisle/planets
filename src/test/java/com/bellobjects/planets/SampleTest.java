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

    public void badOrgSpringframeworkUtilAssertTest() {
        org.springframework.util.Assert.isTrue(false, "Not True");
    }

    public void badOrgTestngAssertTest() {
        org.testng.Assert.assertTrue(false, "Not True");
    }

    public void badJunitFrameworkAssertTest() {
        junit.framework.Assert.assertTrue(false);
    }

    public void badOrgJAssertTest() {
        org.junit.Assert.assertTrue("Not True", false);
    }

    public void badOrgTestngAssertJUnitTest() {
        org.testng.AssertJUnit.assertTrue("Not True", false);
    }

    @Test(dependsOnMethods="badOrgSpringframeworkUtilAssertTest")
    public void dependantOrgSpringframeworkUtilAssertTest() {
    }

    @Test(dependsOnMethods="badOrgTestngAssertTest")
    public void dependantOrgTestngAssertTest() {
    }

    @Test(dependsOnMethods="badJunitFrameworkAssertTest")
    public void dependantJunitFrameworkAssertTest() {
    }

    @Test(dependsOnMethods="badOrgJAssertTest")
    public void dependantOrgJAssertTest() {
    }

    @Test(dependsOnMethods="badOrgTestngAssertJUnitTest")
    public void dependantOrgTestngAssertJUnitTest() {
    }
    
    public void runtimeFailingTest() {
        throw new RuntimeException("Intentional Runtime Exception");
    }
    
    public boolean ignoredTest() {
        return true;
    }
    
    public void includedTest() {
        
    }
}
