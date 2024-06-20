import java.util.Objects;

class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is full.");
        }
    }

    void unEnrollStudent(String studentName) {
        int occ = noOfOccurrences(enrolledStudents, studentName);
        if (occ == 0) {
            System.out.println("Student is not enrolled.");
            return;
        }
        String[] updatedEnrolledStudents = new String[maxCapacity];
        int i = 0, j = 0;
        while (i < enrollments) {
            if (!Objects.equals(enrolledStudents[i], studentName)) {
                updatedEnrolledStudents[j] = enrolledStudents[i];
                j++;
            }
            i++;
        }
        enrollments -= occ;
        enrolledStudents = updatedEnrolledStudents;
    }

    int noOfOccurrences(String[] numArr, String studentName) {
        int occ = 0;
        for (String student : numArr) {
            if (Objects.equals(student, studentName)) {
                occ++;
            }
        }
        return occ;
    }

    void printEnrolledStudents() {
        for (int i = 0; i < enrollments; i++) {
            System.out.println(enrolledStudents[i]);
        }
    }
    public static void main(String[] args) {
        Course c = new Course("B.Tech");
        c.enrollStudents("Pradeep");
        c.enrollStudents("Blokish");
        c.enrollStudents("Pradeep");

        System.out.println("Enrolled students:");
        c.printEnrolledStudents();

        c.unEnrollStudent("Pradeep");
        System.out.println("After un-enrolling Pradeep:");
        c.printEnrolledStudents();
    }
}
