package basic.generic;

public class Member<E>{
    E element;

    public Member(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public static void main(String[] args) {
        Member<Integer> member = new Member<>(10);

        System.out.println(member.getElement());

    }
}
