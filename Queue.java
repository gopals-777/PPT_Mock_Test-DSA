public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return null;
        }

        T dequeuedElement = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return dequeuedElement;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
