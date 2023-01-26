package stacks;

public class StackTest {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new EmployeeStack("Jane", "Jones", 123));
        stack.push(new EmployeeStack("John", "Doe", 453));
        stack.push(new EmployeeStack("Gabriel", "Yasuda", 678));

        stack.printStack();
        System.out.println();

        System.out.println(stack.isEmpty());
        System.out.println("Pooped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
