package stack;

public class Main {
    public static void main(String[] args) {
        try {
            Stack stack = new ArrayStack(5);

            System.out.println(stack);
            for (int i = 0; i < 5; i++) {
                stack.push(i + 1);
                System.out.println(stack);
            }
            // stack.push(10);
            while (!stack.isEmpty()) {
                System.out.println("Popping: " + stack.pop());
                System.out.println(stack);

            }
            stack.pop();
        } catch(StackFullException e) {
            e.printStackTrace();
        } catch(StackEmptyException e) {
            e.printStackTrace();
        }
        
    }
}
