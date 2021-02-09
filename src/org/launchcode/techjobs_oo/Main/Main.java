package org.launchcode.techjobs_oo.Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("", new Employer(""), new Location("Home"), new PositionType(""), new CoreCompetency("Taste"));
        Job job4 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));


        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);

        for (Job job : jobs){
            System.out.println(job);
        }
    }
}
