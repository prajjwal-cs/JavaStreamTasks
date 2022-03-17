/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 17-03-2022
Time: 19:38
File: Student.java */
package task2.implementation;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private final String studentName;
    private final long guardiansContactNumber;
    private double marks;

    public Student(byte rollNumber, String studentName, long guardiansContactNumber, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.guardiansContactNumber = guardiansContactNumber;
        this.marks = marks;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getGuardiansContactNumber() {
        return guardiansContactNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && guardiansContactNumber == student.guardiansContactNumber && Double.compare(student.marks, marks) == 0 && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, studentName, guardiansContactNumber, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", guardiansContactNumber=" + guardiansContactNumber +
                ", marks=" + marks +
                '}';
    }
}