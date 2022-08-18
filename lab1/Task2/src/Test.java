import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide a year");
            return;
        }

        int year = Integer.parseInt(args[0]);
        Course course = getCourse();
        System.out.println(course);

        task2(course, year);
        task3();
    }

    /**
     * Populate with test data
     */
    private static Course getCourse() {
        Student student1 = new Student();
        // not using a constructor yet because it is thought in the second lab :(
        // this is the solution as expected from the students
        student1.setName("Adriana");
        student1.setYear(4);

        Student student2 = new Student();
        student2.setName("Tudor");
        student2.setYear(2);

        Student student3 = new Student();
        student3.setName("Ionut");
        student3.setYear(4);

        Student[] students = {student1, student2, student3};

        Course course = new Course();
        course.setTitle("oop");
        course.setDescription("Object Oriented Programming");
        course.setStudents(students);

        return course;
    }

    private static void task2(Course course, int year) {
        System.out.println("======= Task 2 test =======");


        System.out.println(course.filterStudentByYear(year));
    }

    private static void task3() {
        System.out.println("======= Task 3 test =======");

        Student student1 = new Student();
        student1.setName("Ionut");
        student1.setYear(4);

        Student student2 = new Student();
        student2.setName("Ionut");
        student2.setYear(4);

        System.out.println(student1.equals(student2));
    }


}
