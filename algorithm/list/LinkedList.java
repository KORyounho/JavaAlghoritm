package algorithm.list;

import java.util.Comparator;

public class LinkedList<E>{

    public static class Node<E>{
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> head; // 머리노드
    private Node<E> crnt; // 가리키는 노드

    public LinkedList(){
        head = crnt = null;
    }

    public boolean isEmpty(){  //노드가 비어있는지
        return head == crnt;
    }
    public boolean isOneNode(){  // 노드가 1개인지
        return head.next == null;
    }
    public boolean isTwoNode(){  // 노드 2개인지
        return head.next.next == null;
    }
    public boolean isTailNode(Node<E> node){ // 꼬리노드인지 확인
        return node.next == null;
    }
    public E search(E data){
        Node<E> p = head;
        while(p !=null){
            if(p.data == data) {
                crnt = p;
                return p.data;
            }
            p = p.next;
        }
        return null;
    }
    /*
    public E search(E obj, Comparator <? super E> c){
        Node<E> ptr = head;

        while(ptr!=null){
            if(c.compare(obj, ptr.data)==0){  //Comparaotr을 공부하기. return이 되는 값이 같으면 같은것. 그게 아니라면 정렬할때 이용함.
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
     }
     */

    public void addFirst(E obj){
        Node<E> ptr = head;
        head = crnt = new Node<>(obj, ptr);
    }

    public void addLast(E obj){
        if(isEmpty()){
            addFirst(obj);
        }
        else {
            Node<E> ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.head = new Node<>(10, null);
    }
}
