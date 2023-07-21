package basic.generic;

import java.util.HashMap;
import java.util.Map;

public class Member<E>{
    private E element;
    void set(E element){
        this.element = element;
    }
    E get(){
        return genericMethod(element);
    }

    <T> T genericMethod(T o){
        return o;
    }
    public static void main(String[] args) {
        Member<String> memberA = new Member<>();
        Member<Integer> memberB = new Member<>();
        Member memberC = new Member<>();

        memberC.set("이중민");
        System.out.println(memberC.get());
        memberC.set(5);
        System.out.println(memberC.get());
    }

}
