package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    private static Database instance = null;
    private static int instanceCount = 0;
    private Database(){
        instanceCount++;
    }

    public static Database getDatabase(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachers_sub = new ArrayList<>();
        for (Teacher temp: teachers) {
            if(temp.getSubjects().contains(subject)) {
                teachers_sub.add(temp);
            }
        }
        return teachers_sub;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> students_sub = new ArrayList<>();
        for (Student temp: students) {
            if(temp.getSubjects().containsKey(subject)) {
                students_sub.add(temp);
            }
        }
        return students_sub;
    }

    public List<Student> getStudentsByAverageGrade() {
        students.sort(new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                if(o1.averageGrade() > o2.averageGrade()){
                    return 1;
                }
                return  0;
            }
        });
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> students_sub = getStudentsBySubject(subject);
        students_sub.sort(new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                if(o1.averageGrade() > o2.averageGrade()){
                    return 1;
                }
                return  0;
            }
        });
        return students_sub;
    }
}
