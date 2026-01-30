// Student Management System
// Author: CodeNestJava
// Description: Console-based Java application to manage student records
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentIds = new ArrayList<>();

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

                studentNames.add(name);
                studentIds.add(id);

                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                if (studentNames.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println("Name: " + studentNames.get(i) +
                                ", ID: " + studentIds.get(i));
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
