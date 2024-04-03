public class StackMain {
    public static void main(String[] args)throws Exception {
        CustomStack stack=new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(54);
        stack.push(33);
        stack.push(66);
//        stack.push(69);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
