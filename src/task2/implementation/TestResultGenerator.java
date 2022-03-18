/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 17-03-2022
Time: 19:43
File: TestResultGenerator.java */
package task2.implementation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class TestResultGenerator {
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        Function<Student, String> convertFunction = (Student student) -> student.getStudentName().concat("-")
                .concat(String.valueOf(student.getGuardiansContactNumber()));
        return studentSet.stream().map(convertFunction);
    }

    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {
        return studentSet.stream().filter()
    }
}