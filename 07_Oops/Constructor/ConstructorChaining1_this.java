class Course {
    String courseName;
    String courseCode;
    int enrollmentLimit;

    public Course(String courseName) {
        this(courseName, "UNSET", 100);
    }

    public Course(String courseName, String courseCode) {
        this(courseName, courseCode, 100);
    }

    public Course(String courseName, String courseCode, int enrollmentLimit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrollmentLimit = enrollmentLimit;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrollment Limit: "  + enrollmentLimit);
    }

}

public class ConstructorChaining1_this {
    public static void main(String[] args) {
        Course course1 = new Course("Introduction to Java");
        Course course2 = new Course("Advanced Java", "JAVA102");
        Course course3 = new Course("Data Structures", "COMPSCI303", 30);

        course1.displayCourseInfo();
        course2.displayCourseInfo();
        course3.displayCourseInfo();
    }
}