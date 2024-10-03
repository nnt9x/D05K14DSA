package buoi8;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new SimpleQueue<>(100);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(50);

        queue.display();

        System.out.println(queue.dequeue());
        queue.display();
    }
}
