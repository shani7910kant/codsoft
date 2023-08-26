import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine();
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            students[i] = new Student(name, rollNumber, grade);
        }


        System.out.println("\nStudent Information:");
        for (int i = 0; i < numStudents; i++) {
            Student student = students[i];
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
