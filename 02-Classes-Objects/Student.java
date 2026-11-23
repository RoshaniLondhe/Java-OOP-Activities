class StudentDetails {

    String name;
    String rollNo;
    String branch;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

public class Student {

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails();

        s1.name = "Roshani Londhe";
        s1.rollNo = "20250802426";
        s1.branch = "CSE";

        s1.displayDetails();
    }
}
