class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two Student objects
        Student student1 = new Student("Rahul", 85);
        Student student2 = new Student("Priya", 92);

        // Display details
        student1.display();
        student2.display();
    }
}
