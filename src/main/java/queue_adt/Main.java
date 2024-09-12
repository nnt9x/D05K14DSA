package queue_adt;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new QueueImpl<>(100);
        integerQueue.enqueue(10);
        integerQueue.enqueue(30);
        integerQueue.enqueue(50);
        System.out.println(integerQueue);
        System.out.println(integerQueue.dequeue());
        System.out.println(integerQueue);
    }
}
