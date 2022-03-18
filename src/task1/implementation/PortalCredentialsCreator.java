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

    private UserName createUsername(Student student) {
        var firstName = student.getFirstName();
        var lastName = student.getLastName();
        var rollNumber = student.getRollNumber();
        var currentYear = student.getCurrentYear();

        var userName = String.format("%s.%s.%d.%d", firstName, lastName, rollNumber, currentYear);

        return new UserName(userName);
    }

    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        return studentsList.stream().map(this::createUsername).toList();
    }

    private String createPassword(Student student) {
        return RandomStringUtils.randomAlphanumeric(14);
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList.stream().map(this::createPassword).map(PassWord::new).toList();
    }
}