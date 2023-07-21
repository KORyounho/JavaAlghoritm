package nhnalgorithm.basic.sort;

public class Temp {
    public static void temp(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
