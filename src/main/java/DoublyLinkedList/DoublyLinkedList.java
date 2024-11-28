package DoublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;

    public void add(int data){
        DoublyNode newNode = new DoublyNode(data);
        if(head == null){
            head = newNode;
        }else {
            DoublyNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next= newNode;
            newNode.prev = temp;
        }
    }

    public void displayForward(){
        DoublyNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ==> " );
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        DoublyNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " =>  ");
            temp = temp.prev;
        }
        System.out.print("null");
    }

}
