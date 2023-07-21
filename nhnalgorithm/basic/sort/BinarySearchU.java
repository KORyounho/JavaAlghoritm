//package nhnalgorithm.basic.sort;
//
//import java.util.Arrays;
//
//public class BinarySearchU {
//
//    public static int search(int[] arr, int target){
//        int lp = 0;
//        int rp = arr.length-1;
//
//        int p = (lp+rp)/2;
//        while(p>=0 || p<=arr.length-1){
//            p = (lp+rp)/2;
//            if(target > arr[p]){
//                lp = p;
//            }
//            else if(target < arr[p]){
//                rp = p;
//            }
//            else{
//                return p;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int [] arr = {1, 5, 6, 7, 2, 8};
//
//        Arrays.sort(arr);
//        System.out.println(BinarySearchU.search(arr, 3));
//    }
//}
