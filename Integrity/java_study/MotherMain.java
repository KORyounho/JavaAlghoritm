package Integrity.java_study;

public class MotherMain {
    public static void main(String argv[]) {
        Mother m = new Mother();

        m.setMoney(10000);
        m.show();

        Child c = new Child();
        c.setMoney(1000);
        c.setAge(20);
        c.showAge();

        Baby b = new Baby();
        b.show();

    }
}