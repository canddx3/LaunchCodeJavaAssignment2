package org.launchcode.techjobs_oo.Main;

import java.util.Objects;

public class Job {


    private Integer id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId;
        nextId++;
    }

    public Job ( String name, Employer employer, PositionType positionType ) {
        this();
        this.name = name;
        this.employer = employer;
        this.positionType = positionType;
    }

    public Job ( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency ) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public String toString () {
//        String newName = name.isBlank() ? "Data Not Available" : name;
//        String newEmp = employer.toString().isBlank() ? "Data Not Available" : employer.toString();
//        String newLoc = location.toString().isBlank() ? "Data Not Available" : location.toString();
//        String newPosT = positionType.toString().isBlank() ? "Data Not Available" : positionType.toString();
//        String newCore = coreCompetency.toString().isBlank() ? "Data Not Available" : coreCompetency.toString();

        return "\n" + "Id: " + id +
                        "\n" + "Name: " + name +
                        "\n" + "Employer: " + employer +
                        "\n" + "Location: " + location +
                        "\n" + "Position Type: " + positionType +
                        "\n" + "Core Competency: " + coreCompetency +
                        "\n";
    }


    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() { return Objects.hash(getId()); }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() { return id; }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }
    public void setEmployer( Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }
    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public void setCoreCompetency( CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }
}
