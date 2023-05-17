package algorithm.search;


import java.util.Arrays;

public class BinarySearch implements Search{
    int [] arr;
    int key;
    public BinarySearch(int arr[]){
        Arrays.sort(arr);
        arr = this.arr;
    };
        @Override
    public int search(int[] arr, int key) {
            int pl = 0;
            int pr = arr.length-1;
            do{
                int pc = (pl+pr)/2;
                if(key>arr[pc]){
                    pl = pc+1;
                }
                else if(key < arr[pc]){
                    pr = pc-1;
                }
                else
                    return pc;
            }while(pl<=pr);
            return -1;
    }
}
