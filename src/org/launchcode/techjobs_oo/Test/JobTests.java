package org.launchcode.techjobs_oo.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Main.*;
import static org.junit.Assert.*;

public class JobTests {

    Job jobEmptyCon;
    Job jobEmptyConst;
    Job jobFullCon;
    Job jobEqual;
    Job jobNotEqual;
    Job jobIdOnly;

    @Before
    public void createJobTestObject () {
        jobEmptyCon = new Job();
        jobEmptyConst = new Job();
        jobFullCon = new Job("Product Tester", new Employer("Acme"), new Location("Desert"), new PositionType("QC"), new CoreCompetency("Persistence"));
        jobEqual = new Job("Product Tester", new Employer("Acme"), new Location("Desert"), new PositionType("QC"), new CoreCompetency("Persistence"));
        jobNotEqual = new Job("Tester", new Employer("Data Not Available"), new Location("Mars"), new PositionType("Data Not Available"), new CoreCompetency("Assertive"));
        jobIdOnly = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void emptyTest () {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId () {
        assertTrue(jobEmptyCon.getId() < jobEmptyConst.getId());
    }

    @Test
    public void testJCSAF () {
        assertTrue(jobFullCon instanceof Job);
    }

    @Test
    public void testJFE () {
        assertFalse(jobEqual.equals(jobNotEqual));
    }

    @Test
    public void testBlankLine() {
        char beforeChar = jobEqual.toString().charAt(0);
        char afterChar = jobEqual.toString().charAt(jobEqual.toString().length() -1);
        assertTrue(beforeChar == afterChar);
    }

    @Test
    public void stringLabel() {
        assertEquals("\nId: 10" +
                "\nName: Product Tester" +
                "\nEmployer: Acme" +
                "\nLocation: Desert" +
                "\nPosition Type: QC" +
                "\nCore Competency: Persistence\n",
                jobEqual.toString());
    }

    @Test
    public void isEmpty() {
        assertEquals("\nId: 47" +
                        "\nName: Tester" +
                        "\nEmployer: Data Not Available" +
                        "\nLocation: Mars" +
                        "\nPosition Type: Data Not Available" +
                        "\nCore Competency: Assertive\n",
                jobNotEqual.toString());
    }


    @Test
    public void onlyId() {
        assertEquals("OPPS",
                jobIdOnly.toString());
    }
}


