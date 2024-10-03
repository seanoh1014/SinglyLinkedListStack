import java.util.*;

public class Runner {

    public static void main(String[] args) {

        SingleLinkedListStack stack = new SingleLinkedListStack();
        for (int i = 0; i < 10; i++) {
            stack.addFirst((int) (Math.random() * 10));
        }
        
        System.out.println("isEmpty");
        System.out.println(stack.isEmpty());
        System.out.println("addFirst");
        stack.addFirst(1000);
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println("getFirst");
        System.out.println(stack.getFirst());
        System.out.println("removeFirst");
        System.out.println(stack.removeFirst());
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println("addLast");
        stack.addLast(9999);
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println("contains 9999");
        System.out.println(stack.contains(9999));
        System.out.println("print stack");
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println("number of elements");
        System.out.println(stack.nodeCount(stack.head));
        System.out.println("clear");
        stack.clear();
        System.out.println(Arrays.toString(stack.toArray()));
        

    }
}
