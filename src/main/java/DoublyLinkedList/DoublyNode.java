package DoublyLinkedList;

public class DoublyNode {
    int data;
    DoublyNode next , prev;


    public DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
