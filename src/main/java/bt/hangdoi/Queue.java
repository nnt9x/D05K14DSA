package bt.hangdoi;

import java.util.List;

public class Queue {
    private int capacity;
    private int front = -1;
    private int rear = -1;
    private Cart[] items;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.items = new Cart[capacity];
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }
    public void enqueue(Cart cart){
        if(isFull()){
            throw new RuntimeException("Hàng đợi đã đầy!");
        }
        if(front == -1){
            front = 0;
        }
        rear ++;
        items[rear] = cart;
    }
    public Cart dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        Cart cart = items[front];
        front ++;
        if(front > rear){
            front = rear = -1;
        }
        return cart;
    }
}
