package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
//    public void bubble(int n, int arr[]){
//        for(int i = 0; i<n-1; i++) {
//            for (int j = i; j < n-1-i; j++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//
//    }
////    public void insert(int n, int arr[]){
////        for(int i = 1; i<n; i++){
////            int target = arr[i];
////            int j = i-1;
////            while(j>=0 && target<arr[j]){
////                arr[j+1] = arr[j];
////                j--;
////            }
////            arr[j+1] = target;
////        }
////    }
//    public void select(int n, int arr[]){
//        for(int i = 0; i<n; i++){
//            int min = i;
//            for(int j = 0; j<n; j++){
//                if(arr[min]>arr[j])
//                    min = j;
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String minyong = br.readLine();
        int[] arr = new int[minyong.length()];
        for (int i = 0; i < minyong.length() ; i++) {
            arr[i] = Integer.parseInt(minyong.substring(i, i + 1));
        }

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;
            while (j >= 0 && target < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}

