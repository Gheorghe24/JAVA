package lab4.people;

import lab4.database.Database;

import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return null;
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
