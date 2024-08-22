package queue;

public class Main {
    public static void main(String[] args) {
        // Tao 1 hang doi gom co 15 phan tu
        MyQueue queue = new MyQueue(15);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.display();
        System.out.println("Kich thuoc: "+ queue.size());
        System.out.println(queue.dequeue());
        System.out.println("Kich thuoc: "+ queue.size());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
    }
}
