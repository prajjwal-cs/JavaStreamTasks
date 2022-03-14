/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 13-03-2022
Time: 13:32
File: Student.java */
package task1.implementation;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private byte currentYear;

    public Student(byte rollNumber, String firstName, String lastName, byte currentYear) {
        this.rollNumber = rollNumber;
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.currentYear = currentYear;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && currentYear == student.currentYear && Objects.equals(FIRST_NAME, student.FIRST_NAME) && Objects.equals(LAST_NAME, student.LAST_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, FIRST_NAME, LAST_NAME, currentYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }
}