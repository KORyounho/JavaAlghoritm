package Integrity.java_study;

public class Muilti {
    int a;
    int b;
    String message;

    public Muilti(){
        message = "안녕하세요";
    }

    public Muilti(int a, int b){
        this.a = a;
        this.b = b;
        message = "매개변수가 2개인 메세지를 넣는다.";
        System.out.println("두개의 매개변수가 존재합니다.");
    }
    public Muilti(int a, int b, String message){
        this.a = a;
        this.b = b;
        this.message = message;

        System.out.println("println으로 모든 매개변수가 존재합니다.");
    }

    public int calcMulti(){
        return a*b;
    }
}
