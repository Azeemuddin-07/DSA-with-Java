package JavaFrameworkCollection;

import java.util.Comparator;
import java.util.Stack;

public class StackConcept {
    // The Java collection framework has a class named Stack that provides the functionality of the stack data structure.
    //The Stack class extends the vector class
    static void main(String[] args) {

        //Create Integer types stack
        Stack<Integer> stack = new Stack<>();
        stack.add(89);
        stack.add(8);
        stack.add(9);
        stack.add(890);
        System.out.println("Printing 1st Stack : " +  stack);

        Stack<Integer> SecondStack = new Stack<>();
        SecondStack.add(78);
        SecondStack.add(7);
        SecondStack.add(34);
        SecondStack.add(8);
        System.out.println("Printing 2nd Stack : " + SecondStack);
        // merging two stack
        stack.addAll(SecondStack);
        System.out.println("Printing Merged stack : " + stack);
        //size of stack
        System.out.println("Printing size of Merged Stack : " + stack.size());

        //get(), set() in stack
        System.out.println("Applying the method of get() : " + stack.get(0));

        System.out.println("Sorting the stack : ");


        // now some method of stack
        // push(), pop(), peek(), search(), empty()

        //print the Second stack
        System.out.println(SecondStack);

        SecondStack.push(23);  // it give the last index of push element
        System.out.println(SecondStack);

        // pop
        System.out.println("Pop the elment : " + SecondStack.pop());

        //peek
        System.out.println("After poping the peek element : " + SecondStack.peek());

        //search
        System.out.println("It give the serial number of element is : " + SecondStack.search(78));


        // empty
        System.out.println(stack.empty());




    }
}
