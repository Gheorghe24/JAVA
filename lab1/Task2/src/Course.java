import java.util.ArrayList;
import java.util.Arrays;

public class Course {
//    title (String), description (String), students (array de clase Student
    private String title;
    private String description;

    private Student[] students;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public ArrayList<Student> filterStudentByYear(int year) {
        ArrayList<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getYear() == year) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    @Override
    public String toString() {
        return "MyCourse{\n" +
                "title:'" + title.toUpperCase() + "\'\n" +
                "description:'" + description + "\'\n" +
                "students:" + Arrays.toString(students) +
                "\n}";
    }
}
