package algorithm.queue;

import algorithm.stack.Stack;

public class IntQueue implements Queue {
    private int front;
    private int rear;
    private int capacity;
    private int[] que;
    private int num; // stack의 ptr이라고 생각하자(index)

    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){};
    }

    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){};
    }

    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[maxlen];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    public boolean isFull(){
        return num>=capacity;
    }

    public boolean isEmpty(){
        return num<=0;
    }
    public int enqueue(int x) throws OverflowIntQueueException{
        if (capacity<=num) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear==capacity)
            rear = 0;
        return x;
    }
    public int dequeue() throws EmptyIntQueueException{
        if(isEmpty())
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front == capacity)
            front = 0;
        return x;
    }

    public int peek() throws EmptyIntQueueException{
        if(isEmpty())
            throw new EmptyIntQueueException();
        return que[front];
    }

    public void clear(){
        num = front = rear = 0;
    }

    public int indesOf(int x){
        for(int i =0; i<num; i++){
            int indx = (i+front)%capacity;
            if(que[indx] == x)
                return indx;
        }
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return num;
    }

    public void dump(){
        if(num <= 0)
            System.out.println("비어있음");
        else{
            for (int i = 0; i<num; i++) {
                int indx = (i+front) % capacity;
                System.out.println(que[indx] + " ");
            }
            System.out.println();
        }
    }
    public int search(int x){
        for(int i = 0; i<num; i++)
        {
            int indx = (i+front)%capacity;
            if(que[indx] == x)
                return 1;
        }
        return -1;
    }
}
