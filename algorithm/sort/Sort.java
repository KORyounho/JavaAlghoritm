package algorithm.sort;

public class Sort {
    private static int []arr;
    Sort(int arr[]){
        this.arr = arr;
    };
    public int getArrInd(int i) {
        return arr[i];
    }
    public int[] getArr() {
        return arr;
    }

    public static void bubbleSort(){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectSort(){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++){
                if(arr[min]>arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
   public static void insertSort(){
       for(int i = 1; i<arr.length; i++){
           int target = arr[i];
           int j = i-1;
           while(true){

           }
       }
   }
}
