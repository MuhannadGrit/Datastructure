package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.displayForward();
        System.out.println();
        list.displayBackward();
    }
}
