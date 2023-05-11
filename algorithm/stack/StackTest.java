package algorithm.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(3);
        stack.push(4);

        System.out.println("stack.indexOf(4) = " + stack.indexOf(4));
    }
}
