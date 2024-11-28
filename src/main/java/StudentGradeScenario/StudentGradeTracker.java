package StudentGradeScenario;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Get Student Grade");
            System.out.println("3. Display All Grades");
            System.out.println("4. Exit ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter grade");
                    int grade = scanner.nextInt();
                    studentGrades.put(name, grade);
                    break;

                case 2:
                    System.out.println("Enter student name ");
                    String studentName = scanner.nextLine();
                    if (studentGrades.containsKey(studentName)) {
                        System.out.println(studentName + "'s grade'" +
                                studentGrades.get(studentName));
                    } else {
                        System.out.println("Student does not exist");
                    }
                    break;
                case 3:
                    System.out.println("All students grads:");
                    for (String student : studentGrades.keySet()) {
                        System.out.println(student + ": " + studentGrades.get(student));
                    }
                    break;
                case 4:
                    running = false;

                default:
                    System.out.println("Invlid choice, PLease try again!");
            }
        }
        scanner.close();
    }
}
