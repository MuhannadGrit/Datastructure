package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
         myStack.push(1);
         myStack.push(2);
         myStack.push(3);

        System.out.println("I början Stackens element" + myStack);

        System.out.println("Poppat element " + myStack.pop());

        System.out.println("Topp av stacken " + myStack.peek());

        System.out.println("Stackens element" + myStack);
    }
}
