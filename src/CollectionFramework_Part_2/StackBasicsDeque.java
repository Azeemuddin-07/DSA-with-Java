package CollectionFramework_Part_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasicsDeque {
    public static void main() {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(14);
        stack.push(10);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());



    }
}
