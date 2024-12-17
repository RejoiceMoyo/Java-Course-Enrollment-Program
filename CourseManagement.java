import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static Map<Student, ArrayList<Course>> studentCourses = new HashMap<>();
    private static Map<Student, Map<Course, Double>> studentGrades = new HashMap<>();

    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course course = new Course(courseCode, courseName, maxCapacity);
        courses.add(course);
    }

    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        studentCourses.putIfAbsent(student, new ArrayList<>());
        studentCourses.get(student).add(course);
    }

    public static void assignGrade(Student student, Course course, double grade) {
        student.assignGrade(course, grade);
        studentGrades.putIfAbsent(student, new HashMap<>());
        studentGrades.get(student).put(course, grade);
    }

    public static double calculateOverallGrade(Student student) {
        Map<Course, Double> grades = studentGrades.get(student);
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }

    // Needed for finding courses and students in Main class
    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Student> getStudents() {
        return new ArrayList<>(studentCourses.keySet());
    }
}
