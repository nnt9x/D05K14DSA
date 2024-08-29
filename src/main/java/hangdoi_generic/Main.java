package hangdoi_generic;

public class Main {
    public static void main(String[] args) {
        // Hang doi chua so nguyen
        Queue<Integer> queue = new Queue<>(100);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.display();

        Queue<String> queue1 = new Queue<>(20);
        queue1.enqueue("Hello");
        queue1.enqueue("World");
        queue1.display();

        Queue<Queue<String>> queueQueue = new Queue<>(20);
        queueQueue.enqueue(queue1);
        queueQueue.display();


    }
}
