package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton

    public static int getNumberOfInstances() {
        // TODO
        return 0;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        // TODO
        return null;
    }

    public List<Student> findAllStudents() {
        // TODO
        return null;
    }

    public List<Teacher> findAllTeachers() {
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
