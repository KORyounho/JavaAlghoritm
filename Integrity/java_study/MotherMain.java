package Integrity.java_study;

import java.util.Arrays;
import java.util.Comparator;

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
        int [][] arr_2 = new int[2][2];

        arr_2[0][0] = 1;
        arr_2[0][1] = 2;
        arr_2[1][0] = 1;
        arr_2[1][1] = 0;

        Arrays.sort(arr_2, (e1, e2)->{
            if(e1[0] == e2[0])
                return e1[1] - e2[1];
            else
                return e1[0] - e2[0];
        });
    }
}