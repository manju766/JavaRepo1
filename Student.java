class Course {
    private String semesterName;
    private String[] courseNames;
    private int[] courseMarks;
    private int courseCount;

   Course(String semesterName, int numberOfCourses) {
        this.semesterName = semesterName;
        this.courseNames = new String[numberOfCourses];
        this.courseMarks = new int[numberOfCourses];
        this.courseCount = 0;
    }

  void addCourse(String courseName, int marks) {
        if (courseCount < courseNames.length) {
            courseNames[courseCount] = courseName;
            courseMarks[courseCount] = marks;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Limit reached for " + semesterName);
        }
    }

     void displayCourses() {
        System.out.println("Semester: " + semesterName);
        System.out.println("Courses and Marks:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course: " + courseNames[i] + ", Marks: " + courseMarks[i]);
        }
    }
}

class Student1 {
    private String name;
    private String dateOfBirth;

    public Student1(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age verification done using Date input (no calculation).");
    }
}
public class Student {
    public static void main(String[] args) {
        // Example student
        Student student1 = new Student1("John Doe", "2004-05-15");
        student.displayStudentInfo();

         // Semester 1 courses
         Course semester1 = new Course("Semester 1", 3);
         semester1.addCourse("Mathematics", 85);
         semester1.addCourse("Physics", 78);
         semester1.addCourse("Chemistry", 90);
 
         // Semester 2 courses
         Course semester2 = new Course("Semester 2", 2);
         semester2.addCourse("Biology", 88);
         semester2.addCourse("English", 92);
 
         // Display semester details
         semester1.displayCourses();
         semester2.displayCourses();

    }
}
