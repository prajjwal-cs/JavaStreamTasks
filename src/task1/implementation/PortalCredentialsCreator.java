/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 13-03-2022
Time: 13:43
File: PortalCredentialsCreator.java */
package task1.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        List<UserName> usernames = new ArrayList<>();
        Function<Student, String> mappingUsernames = student ->
                    student.getFirstName().concat(".").
                        concat(student.getLastName()).concat("_cs19");

        usernames = (List<UserName>) studentsList.stream().map(mappingUsernames);
        return usernames;
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return (List<PassWord>) studentsList.stream().map(s -> s.getFirstName().
                concat(String.valueOf(s.getRollNumber())));
    }
}