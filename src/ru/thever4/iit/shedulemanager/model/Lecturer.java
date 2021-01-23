package ru.thever4.iit.shedulemanager.model;

public class Lecturer {
    private final String lastName, firstName, secondName;
    private String shortName;

    public Lecturer(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;

        this.shortName = String.format("%s %s. %s.", this.lastName, this.firstName.substring(0, 1), this.secondName.substring(0, 1));
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return shortName;
    }
}
