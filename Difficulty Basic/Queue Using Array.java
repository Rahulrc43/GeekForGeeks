class myQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public myQueue(int n) {
        capacity = n;
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        front = (front + 1) % capacity;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
}
