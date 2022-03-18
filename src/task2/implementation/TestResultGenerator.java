/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 17-03-2022
Time: 19:43
File: TestResultGenerator.java */
package task2.implementation;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestResultGenerator {

    private String studentDetails(Student student) {
        return student.getStudentName().concat("-").concat(String.valueOf(student.getGuardiansContactNumber()));
    }

    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return studentSet.stream().filter(student -> student.getMarks() < 33.0)
                .map(this::studentDetails).collect(Collectors.toCollection(HashSet<String>::new));
    }

    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {
        Comparator<Student> markSorting = (s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks());

        return studentSet.stream().sorted(markSorting).collect(Collectors.toSet());
    }
}