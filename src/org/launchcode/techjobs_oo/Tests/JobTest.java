package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    @Before
    public void createJobObject() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //System.out.println(testJob3.toString());
    }

    @Test
    public void testSettingJobId() {
        assertFalse(testJob1.getId() == testJob2.getId());
        assertEquals(testJob2.getId()-testJob1.getId(),1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3.getName() instanceof String);
        assertEquals(testJob3.getName(),"Product tester");
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertEquals(testJob3.getEmployer().getValue(),"ACME");
        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals(testJob3.getLocation().getValue(),"Desert");
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertEquals(testJob3.getPositionType().getValue(),"Quality control");
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob3.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3 == testJob4);

    }

    @Test
    public void testJobToString(){
        assertTrue(testJob3.toString().contains("\n"));
        assertTrue(testJob3.toString().contains(testJob3.getName()));
        assertTrue(testJob3.toString().contains(testJob3.getEmployer().getValue()));
        assertTrue(testJob3.toString().contains(testJob3.getLocation().getValue()));
        assertTrue(testJob3.toString().contains(testJob3.getPositionType().getValue()));
        assertTrue(testJob3.toString().contains(testJob3.getCoreCompetency().getValue()));
    }



}
