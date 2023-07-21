package nhnalgorithm.basic.sort;

import static nhnalgorithm.basic.sort.Temp.temp;

public class Bubble{
    public static int [] sort(int arr[]){
        int p1, p2, temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp(arr, j, j+1);
                }
            }
        }
        return arr;
    }
}
