import java.util.*;
import java.util.Stack;

public class Stacks_and_Queue {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.capacity());
        stack.push(34);
        stack.push(45);
        stack.push(54);
        stack.push(33);
        stack.push(66);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Queue<Integer> queue=new LinkedList<>();
        queue.add(12);
        queue.add(54);
        queue.add(32);
        queue.add(67);
        queue.add(87);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(98);
        deque.addLast(87);
        deque.removeFirst();


    }
}
