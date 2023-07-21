package nhnalgorithm.basic;

import nhnalgorithm.basic.sort.Bubble;

public class Main {
    public static void main(String[] args) {

        int [] arrBub = {7, 4, 5, 1, 3};
        //Bubble 정렬
        System.out.println("버블 정렬");
        Bubble.sort(arrBub);
        for (int i : arrBub) {
            System.out.println(i);
        };

        int [] arrSel = {7, 4, 5, 1, 3};
        System.out.println("선택 정렬");
        Bubble.sort(arrSel);
        for (int i : arrSel) {
            System.out.println(i);
        };

        int [] arrIns = {7, 4, 5, 1, 3};
        System.out.println("삽입 정렬");
        Bubble.sort(arrIns);
        for (int i : arrIns) {
            System.out.println(i);
        };
    }
}
