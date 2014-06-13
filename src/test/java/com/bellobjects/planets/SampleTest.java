package com.bellobjects.planets;

import org.junit.Test;


public class SampleTest {

    public void goodTest() {
        org.springframework.util.Assert.isTrue(true, "Not True");
        org.junit.Assert.assertTrue("Not True", true);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void badOrgSpringframeworkUtilAssertTest() {
        org.springframework.util.Assert.isTrue(false, "Not True");
    }

    @Test(expected = java.lang.AssertionError.class)
    public void badOrgJunitAssertTest() {
        org.junit.Assert.assertTrue("Not True", false);
    }

    private int state = 0;

	public void state0() {
		org.junit.Assert.assertEquals(0, state++);
	}

    public void runtimeFailingTest() {
        throw new RuntimeException("Intentional Runtime Exception");
    }

//    public boolean ignoredTest() {
//        throw new RuntimeException("methods with return values are not tests");
//    }

    public void includedTest() {
        
    }
}
