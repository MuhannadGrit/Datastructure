package StackScenario;

import java.util.Scanner;
import java.util.Stack;

public class TextEditorUndoFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> textStack = new Stack<>();
        String currentText = "";

        System.out.println("Simple Text Editor");
        System.out.println("Commands:");
        System.out.println("1. Type <word> - Add a word to the text.");
        System.out.println("2. Undo - Remove the last added word.");
        System.out.println("3. Display - Show the current text.");
        System.out.println("4. Exit - Close the editor.");


        while(true){
            System.out.println("\nEnter a comman: ");
            String input =  scanner.nextLine();

            if (input.startsWith("Type")){
                String[] part = input.split(" ", 2);
                if(part.length < 2){
                    System.out.println("Please type a valid word after `Type` ");
                    continue;
                }
                String word = part[1];
                textStack.push(word);
                System.out.println("Word added in the stack: " + word);
            } else if (input.equalsIgnoreCase("Undo")) {
                if(!textStack.isEmpty()){
                    String removedWrod = textStack.pop();
                    System.out.println("Undo successful Remove word: " + removedWrod);
                }else {
                    System.out.println("Nothing to undo!");
                }
            }else if(input.equalsIgnoreCase("Display")){
                currentText = String.join(" ", textStack);
                System.out.println("Current Text: " + currentText);
            }else if(input.equalsIgnoreCase("Exit")){
                System.out.println("Exit successful");
                break;
            }else{
                System.out.println("Invalid command, please try again! ");
            }
        }
        scanner.close();
    }
}
