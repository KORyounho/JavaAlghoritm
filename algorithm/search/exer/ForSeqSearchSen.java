package algorithm.search.exer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForSeqSearchSen {
    public static int seqSearchSen(int arr[], int key){
        arr[arr.length-1] = key;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        } return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("사이즈 : ");
        int size = Integer.parseInt(br.readLine());

        int [] array = new int[size+1];
        for(int i = 0; i<array.length-1; i++){
            System.out.printf("%d번째\n", i);
            array[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("키값:");
        int key = Integer.parseInt(br.readLine());
        int index = seqSearchSen(array, key);
        if(index == array.length) {
            System.out.println("seqSearchSen(array, key); = " + index);
        }
        else {
            System.out.println("index = " + index);
        }
    }
}
