package lab4.people;

import lab4.database.Database;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        // TODO
        return 0;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return null;
    }

    public int getGradeForSubject(String subject) {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return null;
    }

    public List<Student> getAllStudents() {
        // TODO
        return null;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return null;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return null;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return null;
    }
}
