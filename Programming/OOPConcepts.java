
class Person {

    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {

    String rollNo;

    Student(String name, int age, String rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    
    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
    }

    void displayStudent(String course) {
        System.out.println("Course: " + course);
    }
}

public class OOPConcepts {

    public static void main(String[] args) {

        Student s1 = new Student(
            "Roshani Londhe",
            20,
            "20250802426"
        );

        System.out.println("Student Details:");

        s1.display();
        s1.displayStudent();
        s1.displayStudent("Electronics and Communication Engineering");
    }
}
