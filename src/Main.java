import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Add Student selected");
        } else if (choice == 2) {
            System.out.println("View Students selected");
        } else if (choice == 3) {
            System.out.println("Exiting program...");
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
