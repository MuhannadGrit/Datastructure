package Scenario1;

public class StudentList {
    private Node head;

    public void addStudent(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayStudents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
        }
    }
}
