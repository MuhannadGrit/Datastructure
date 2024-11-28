package CircularLinkedList;

public class CircularLinkedList {
    CircularNode head;

    public void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        }else{
            CircularNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public  void display(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        CircularNode temp = head;
        do{
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }while (temp != head);
            System.out.println("Circulation");
    }
}
