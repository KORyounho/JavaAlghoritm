package algorithm.stack;

public class Stack {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }

        ;
    }

    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;

        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public void init_stack() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i = ptr-1; i > 0; i--) {
            if (stk[i] == x)
                return i;
        }
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        if(ptr == 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if(ptr == capacity)
            return true;
        else return false;
    }

    public void dump() { // 바닥 -> 꼭대기 순서로 출력
        if (isEmpty())
            System.out.println("스택이 비어있음");
        else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(i + "번째 : " + stk[i]);
            }
        }
    }
}
