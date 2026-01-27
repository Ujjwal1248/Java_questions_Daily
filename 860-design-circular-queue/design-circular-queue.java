class MyCircularQueue {
    public int head = -1;
    public int tail = -1;
    int size;
    int[] q;

    public MyCircularQueue(int k) {
        q = new int[k];
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (isEmpty())
            head = 0;
        tail = (tail + 1) % size;
        q[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        
        if(head == tail){
            head = tail = -1;
        }
        else{
            head = (head + 1) % size;
        }
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return q[head];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return q[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */