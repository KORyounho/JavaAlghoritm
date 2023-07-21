package nhnalgorithm.basic.sort;

import static nhnalgorithm.basic.sort.Temp.temp;

public class Select {
    public void sort(int [] arr){
        int small = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
                temp(arr, small, i);
            }
        }
    }
}
