package algorithm.linked;

import java.util.NoSuchElementException;

public class SLinkedList <E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private Node<E> search(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node<E> x = head;
        for(int i = 0; i < index; i++){
            x = x.next;
        }
        return x;
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<E>(value);
        newNode.next = head;
        head = newNode;
        size++;

        if (head == null) {
            tail = head;
        }
    }
    public void add(E value){
        Node<E> newNode = new Node<E>(value);
        if(size == 0){
            addFirst(value);
            return;
        }

        tail.next = newNode; // 이전 tail이 다음을 가리키는 노드
        tail = newNode; // 새로 추가된 노드가 tail이다
        size++;
    }

    public void add(int index, E value){
        if(index>size|| index<0){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            addFirst(value);
            return;
        }
        if(index == size){
            add(value);
        }
        Node<E> prev_Node = search(index-1);
        Node<E> next_Node = prev_Node.next;

        Node<E> newNode = new Node<E>(value);
        prev_Node.next = newNode;
        newNode.next = next_Node;
        size++;
    }

    public E remove(){
        Node<E> headNode = head; // 헤더노드 저장소 만듬.

        if(headNode == null)
            throw new NoSuchElementException(); // 만약에 head가 없음 -> 데이터가 연결리스트에 아무것도 없을경우, 던져서 리턴

        E element = headNode.data; // 일반적인 경우, 제거하려는 요소의 값을 E로 저장
        Node<E> nextNode = head.next; // 제거했을경우, head를 동기화 하기 위해 2번째 노드를 저장함

        head.data = null; // 클래스에 정의된 head의 값들 전부 초기화
        head.next = null;

        head = nextNode; // head를 다음 노드껄로 변경
        size--; // 제거했으니 사이즈 down

        if(size==0){ // 제거하고 연결리스트가 비워질 경우
            tail = null; // 꼬리값도 null
        }
        return element; // 요소 반환
    }

    public E remove(int index){
        if(index >=size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            remove();
        }

        Node<E> prevNode = search(index-1);
        Node<E> removeNode = prevNode.next;
        Node<E> nextNode = removeNode.next;

        E element = removeNode.data;

        prevNode.next = nextNode;
        if(prevNode.next == null){
            tail = prevNode;
        }

        removeNode.data = null;
        removeNode.next = null;
        size--;

        return element;
    }

}
