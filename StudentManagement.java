
class StudentRecord {

    string rollNo;
    String name;
    double marks;

    StudentRecord(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------");
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        StudentRecord s1 =
            new StudentRecord(20250802426, "Roshani Londhe", 85.5);

        StudentRecord s2 =
            new StudentRecord(102, "Amit", 90.0);

        StudentRecord s3 =
            new StudentRecord(103, "Priya", 88.5);

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
