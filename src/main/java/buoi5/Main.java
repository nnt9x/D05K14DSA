package buoi5;

public class Main {
    public static void main(String[] args) {
        // Stack so nguyen
        Stack<Integer> stack1 = new StackImpl<>(100);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.display();

        // Stack chua doi tuong
        Stack<Book> stack2 = new StackImpl<>(20);
        stack2.push(new Book(1,"27272727","Book 1","Author 1"));
        stack2.push(new Book(2,"27272728","Book 2","Author 2"));
        stack2.push(new Book(3,"27272729","Book 3","Author 3"));
        System.out.println(stack2.pop());
        stack2.display();
    }
}
