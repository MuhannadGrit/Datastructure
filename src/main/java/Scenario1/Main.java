package Scenario1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        StudentList list = new StudentList();
        list.addStudent("Muhannad");
        list.addStudent("Erik");
        list.addStudent("Lotta");

        System.out.println("Students enrolled:");
        list.displayStudents();

        System.out.println("This is result of using build-in LinkedList");
        useBuildInLinkedList();
    }

    public static void useBuildInLinkedList() {
        LinkedList<String> studentList = new LinkedList<>();

        // Add students
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");

        // Display students
        for (String student : studentList) {
            System.out.print(student + " ==> ");
        }

        // Remove a student
        studentList.remove("asd");
        System.out.println();
        System.out.println("After removing Bob:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
