package algorithm.search;


import java.util.Arrays;

public class BinarySearch implements Search {
    static int[] arr;
    static int key;

    public BinarySearch(int arr[], int key) { // 이진검색은 정렬되어져있는 상태에서 사용하는 검색 알고리즘
        Arrays.sort(arr);
        this.arr = arr;
        this.key = key;
    }

    ;

   @Override
//    public int search(int[] arr, int key) {
//            int pl = 0;
//            int pr = arr.length-1;
//            do{
//                int pc = (pl+pr)/2;
//                if(key>arr[pc]){
//                    pl = pc+1;
//                }
//                else if(key < arr[pc]){
//                    pr = pc-1;
//                }
//                else
//                    return pc;
//            }while(pl<=pr);
//            return -1;
//    }
    public int search() {
        int pl = 0;
        int pr = arr.length - 1;
        do {
            int pc = (pl + pr) / 2;
            if (arr[pc] > key)
                pr = pc - 1;
            else if (arr[pc] < key)
                pl = pc + 1;
            else{
                for(int i = pc; arr[pc] == arr[i]; i--) // 같은값을 찾았을때 가장 작은 인덱스를 반환함.
                    pc = i;
                return pc;
            }
            } while (pl <= pr);
            return -1;
        }
    }

