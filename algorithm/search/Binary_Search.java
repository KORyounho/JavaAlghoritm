package algorithm.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Binary_Search implements Search{
    public static int BinSearch(int arr[], int key){
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int key = Integer.parseInt(br.readLine());
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("인덱스 = %d", Arrays.binarySearch(arr, key));
        System.out.printf("인덱스 = %d", BinSearch(arr, key));
        System.out.printf("인덱스 = %d", Arrays.binarySearch(arr, key));
    }

    @Override
    public int search(int[] arr, int key) {
        return 0;
    }
}
