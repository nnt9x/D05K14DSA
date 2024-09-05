package nganxep;

public class Main {
    public static void main(String[] args) {
        StackNumber stackNumber = new StackNumber(100);
        stackNumber.push(10);
        stackNumber.push(20);
        stackNumber.push(50);
        stackNumber.push(60);
        stackNumber.display();
        System.out.println("Top:" + stackNumber.pop());
        stackNumber.display();
        stackNumber.push(10);
        stackNumber.display();
    }
}
