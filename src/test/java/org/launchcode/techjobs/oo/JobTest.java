package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;


public class JobTest {

    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
Job jobOneData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertEquals("Product tester", jobOneData.getName());
assertEquals("ACME", jobOneData.getEmployer().getValue());
assertEquals("Desert", jobOneData.getLocation().getValue());
assertEquals("Quality control", jobOneData.getPositionType().getValue());
assertEquals("Persistence", jobOneData.getCoreCompetency().getValue());
    }

//The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
    @Test
    public void testJobsForEquality(){
Job job1 = new Job("Software Developer", new Employer("Bank of America"), new Location("Philadelphia"), new PositionType("Entry Level"), new CoreCompetency("Java") );
Job job2 = new Job("Software Developer", new Employer("Bank of America"), new Location("Philadelphia"), new PositionType("Entry Level"), new CoreCompetency("Java") );
        assertNotEquals(job1, job2);
    }

@Test
public void  testToStringStartsAndEndsWithNewLine(){
    Job job = new Job("Software Engineer", new Employer("City Bank"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
    String expected = System.lineSeparator() +
            "ID: " + job.getId() + System.lineSeparator() +
            "Name: Software Engineer" + System.lineSeparator() +
            "Employer: City Bank" + System.lineSeparator() +
            "Location: California" + System.lineSeparator() +
            "Position Type: Full-time" + System.lineSeparator() +
            "Core Competency: Java" + System.lineSeparator();
    assertEquals(expected, job.toString());

}

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job3 = new Job("Software Engineer", new Employer("City Bank"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() +
                "ID: " + job3.getId() + System.lineSeparator() +
                "Name: Software Engineer" + System.lineSeparator() +
                "Employer: City Bank" + System.lineSeparator() +
                "Location: California" + System.lineSeparator() +
                "Position Type: Full-time" + System.lineSeparator() +
                "Core Competency: Java" + System.lineSeparator();
        assertEquals(expected, job3.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job4 = new Job("", new Employer("City Bank"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expectedResult = System.lineSeparator() +
                "ID: " + job4.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: City Bank" + System.lineSeparator() +
                "Location: California" + System.lineSeparator() +
                "Position Type: Full-time" + System.lineSeparator() +
                "Core Competency: Java" + System.lineSeparator();

        assertEquals(expectedResult, job4.toString());
    }
}
