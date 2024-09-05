package adt;

public class Main {
    public static void main(String[] args) {
        // Tao stack chua so nguyen
        Stack<Integer> integerStack = new StackArray<>(100);
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(50);
        // In ra stack
//        System.out.println(integerStack);
        // Thu pop
//        System.out.println(integerStack.pop());
//        System.out.println(integerStack);

        Stack<String> stringStack = new StackArray<>(10);
        stringStack.push("Hello");
        stringStack.push("Hi");
        stringStack.push("Java");
//        System.out.println(stringStack);

        // Tao stack chua cac stack
        Stack<Stack> stackStack = new StackArray<>(20);
        stackStack.push(integerStack);
        stackStack.push(stringStack);

        System.out.println(stackStack);

        // Stack chua stack chua stack
        Stack<Stack<Stack<String>>> stackStack1 = new StackArray<>(10);

    }
}
