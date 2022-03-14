/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 14-03-2022
Time: 22:39
File: Main.java */
package task1.main;

import task1.implementation.PortalCredentialsCreator;
import task1.implementation.Student;
import task1.implementation.UserName;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student((byte) 30, "Prajjwal", "Pachauri", (byte) 3);
        Student student2 = new Student((byte) 35, "Sachin", "Kumar", (byte) 3);
        Student student3 = new Student((byte) 49, "Vaidik", "Nigam", (byte) 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        List<UserName> userNameList = new ArrayList<>();

        PortalCredentialsCreator portalCredentialsCreator = new PortalCredentialsCreator();
        userNameList = portalCredentialsCreator.createListOfUserNames(studentList);
        System.out.println("userNameList.stream() = " + userNameList);
    }
}