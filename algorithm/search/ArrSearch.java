package algorithm.search;

public class ArrSearch implements Search{
    @Override
    public int search(int[] arr, int key) {
        int i = 0;
        while(arr.length>i){
            if(arr[i]==key){
                return i;
            }
            i++;
        }
        return -1;
    }
}
