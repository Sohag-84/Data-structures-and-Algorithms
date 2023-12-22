package Stack;

public class Stack {
    public static void main(String[] args) {
        push(12);
        push(11);
        push(15);
        System.out.println("delete item: " + pop());
        ;
        System.out.println("Top item: " + peek());
        push(25);
    }

    static int CAPACITY = 3;
    static int[] stack = new int[CAPACITY];
    static int top = -1;

    static void push(int val) {
        if (top < CAPACITY - 1) {
            top = top + 1;
            stack[top] = val;
            System.out.println("Succefully added item: " + val);
        } else {
            System.out.println("Exception! No spaces");
        }
    }

    static int peek() {
        if (top >= 0) {
            return stack[top];
        }
        System.out.println("Exception from Peek! Empty stack");
        return -1;
    }

    static int pop() {
        if (top >= 0) {
            int val = stack[top];
            top = top - 1;
            return val;
        } else {
            System.out.println("Exception from Pop! Empty stack");
            return -1;
        }
    }
}
