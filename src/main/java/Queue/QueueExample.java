package Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        queueWithLinkedList();
        queueWithPriorityQueue();
    }

    public static void queueWithLinkedList (){
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");

        System.out.println("Pollat element" + queue.poll());
        System.out.println("Huvud elemet"+ queue.peek());
        System.out.println("Element i Kö "+ queue);
    }

    public static void queueWithPriorityQueue(){
        Queue<String> queue2 = new PriorityQueue<>();
        queue2.add("First");
        queue2.add("Second");
        queue2.add("Third");

        System.out.println("My Queue"+ queue2);

        queue2.remove("First");
        System.out.println("After removing first" + queue2);

        System.out.println("Poll " + queue2.poll());
        System.out.println("Is empty" + queue2.isEmpty());
    }
}
