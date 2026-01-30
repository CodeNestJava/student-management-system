// Student Management System
// Author: CodeNestJava
// Description: Console-based Java application to manage student records

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                scanner.nextLine(); // consume newline
                String name = scanner.nextLine();

                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();

                Student student = new Student(name, id);
                students.add(student);

                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (Student student : students) {
                        System.out.println("Name: " + student.getName() +
                                ", ID: " + student.getId());
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
