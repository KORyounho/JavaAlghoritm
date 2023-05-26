package algorithm.queue;

public interface Queue { // 인터페이스이기에 꼭 필요한 것들

    public int enqueue(int x);

    public int dequeue();

    public int peek();

    public boolean isEmpty();
    public boolean isFull();

    public void clear();

    public int indesOf(int x);

    public int getCapacity();

    public int size();

    public void dump();

    public int search(int x);
}
