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

    /**
     * It concatenates the student name and the guardians contact number.
     *
     * @param student The student object that is being passed to the method.
     * @return The concatenated string of the student name and the guardians contact number.
     */
    private String studentDetails(Student student) {
        return student.getStudentName().concat("-").concat(String.valueOf(student.getGuardiansContactNumber()));
    }

    /**
     * Given a set of students, return a set of strings containing the details of the students who failed
     *
     * @param studentSet The set of students for which we want to get the details of the students who failed.
     * @return A HashSet of Strings.
     */
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return studentSet.stream().filter(student -> student.getMarks() < 33.0)
                .map(this::studentDetails).collect(Collectors.toCollection(HashSet<String>::new));
    }

    /**
     * Given a set of students, return a set of students sorted by their marks
     *
     * @param studentSet The set of students to be sorted.
     * @return A set of students sorted by their marks.
     */
    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {
        Comparator<Student> markSorting = (s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks());

        return studentSet.stream().sorted(markSorting).collect(Collectors.toSet());
    }
}