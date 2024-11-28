package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(4);

        System.out.println("Ta bort första element  " + deque.removeFirst() );
        System.out.println("Ta bort sista element  " + deque.removeLast() );

        System.out.println(deque);
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(4);
        System.out.println(deque);
        System.out.println(deque.reversed());
    }
}
