package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Main.*;

import static org.junit.Assert.*;

public class JobTests {

    Job jobName;
    Job jobEmp;
    Job jobTest;
    Job jobObj;
    Job jobObjs;

    @Before
    public void createJobTestObject () {
        jobName = new Job();
        jobEmp = new Job();
        jobTest = new Job("Product Tester", new Employer("Acme"), new Location("Desert"), new PositionType("QC"), new CoreCompetency("persistence"));
        jobObj = new Job("Product Tester", new Employer("Acme"), new Location("Desert"), new PositionType("QC"), new CoreCompetency("persistence"));
        jobObjs = new Job("Product Tester", new Employer("Acme"), new Location("Desert"), new PositionType("QC"), new CoreCompetency("persistence"));

    }

    @Test
    public void emptyTest () {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId () {
        assertTrue(jobName.getId() < jobEmp.getId());
    }

    @Test
    public void testJCSAF () {
        assertTrue(jobTest instanceof Job);
    }

    @Test
    public void testJFE () {
        assertNotEquals(jobObj.getId(), jobObjs.getId());
    }

//    @Test
//    public void testBlankLine() {
//        assertTrue(jobObj.toString() == "     ");
//    }
}


