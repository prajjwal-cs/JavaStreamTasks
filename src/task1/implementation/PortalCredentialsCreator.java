/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 13-03-2022
Time: 13:43
File: PortalCredentialsCreator.java

*/
package task1.implementation;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class PortalCredentialsCreator {

    /**
     * Create a username from the student's first name, last name, roll number and current year
     *
     * @param student The student object that we want to create a username for.
     * @return Nothing.
     */
    private UserName createUsername(Student student) {
        var firstName = student.getFirstName();
        var lastName = student.getLastName();
        var rollNumber = student.getRollNumber();
        var currentYear = student.getCurrentYear();

        var userName = String.format("%s.%s.%d.%d", firstName, lastName, rollNumber, currentYear);

        return new UserName(userName);
    }

    /**
     * Create a list of user names from a list of students
     *
     * @param studentsList the list of students to create usernames for
     * @return A list of UserName objects.
     */
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        return studentsList.stream().map(this::createUsername).toList();
    }

    /**
     * Create a random alphanumeric string of length 14
     *
     * @param student The student object that is being created.
     * @return A String of random alphanumeric characters.
     */
    private String createPassword(Student student) {
        return RandomStringUtils.randomAlphanumeric(14);
    }

    /**
     * Create a list of passwords for each student in the list of students
     *
     * @param studentsList a list of students
     * @return A list of PassWord objects.
     */
    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList.stream().map(this::createPassword).map(PassWord::new).toList();
    }
}