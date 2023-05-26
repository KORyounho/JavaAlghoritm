package algorithm.queue;

public class MiainQueue {
    public static void main(String[] args) {
        Queue queue = new IntQueue(5);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.dequeue();

        queue.dump();
//        queue.enqueue(10);
        System.out.println(queue.indesOf(5));
        System.out.println(queue.indesOf(10));

        System.out.println(queue.search(5));
        System.out.println(queue.search(10));
    }
}
