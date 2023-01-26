package stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private EmployeeStack[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new EmployeeStack[capacity];
    }

    public void push(EmployeeStack employee) {
        if (top == stack.length) {
            //resize
            EmployeeStack[] newArray = new EmployeeStack[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public EmployeeStack pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        EmployeeStack employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public EmployeeStack peek() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top -1; i >= 0; i--)
            System.out.println(stack[i]);
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
