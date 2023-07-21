package nhnalgorithm.basic.sort;

public class Insert {
    public int [] sort(int []arr){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            for(int j = i-1; j>=i; j--){
                if(arr[j] < key)
                    break;
                arr[j+1] = arr[j];
            }
        }
        
        return arr;
    }
}
