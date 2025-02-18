class Classroom {
    // Static variable for tracking total attendance across all classrooms
    static int totalAttendance = 0;

    // Non-static variable for tracking attendance in this specific classroom
    int classroomAttendance;

    // Method to mark a student's attendance
    public void markAttendance() {
        classroomAttendance++;  // Increment attendance for this classroom
        totalAttendance++;      // Increment total attendance across the school
    }

    public void displayAttendance() {
        System.out.println("Attendance in this classroom: " + classroomAttendance);
        System.out.println("Total attendance in school: " + totalAttendance);
    }
}

public class Main{
	public static void main(String[] args) {
        Classroom class101 = new Classroom();
        class101.markAttendance();
        class101.markAttendance();
        class101.displayAttendance();  // Class 101: 2, Total: 2

        Classroom class102 = new Classroom();
        class102.markAttendance();
        class102.markAttendance();
        class102.markAttendance();
        class102.displayAttendance();  // Class 102: 3, Total: 5
    }
}