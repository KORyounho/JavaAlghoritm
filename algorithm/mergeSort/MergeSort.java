package algorithm.mergeSort;

public class MergeSort {
    static int[] buff;
    public final int []arr = {8, 4, 3, 7, 6, 5, 2, 1};

    public void mergeSort(int arr[], int left, int right){
        while(left != right){
            int i;
            int center = (left+right) /2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(arr, left, center);
            mergeSort(arr, center+1, right);

            for(i = left; i<=center; i++){
                buff[p++] = arr[i];
            }
        }

    }
    //두개의 배열을 정렬 ( 단 두개의 배열은 이미 정렬되어져 있어야함)
//    public void merge(int[] a, int na, int[] b, int nb, int[] c){
//        int pa = 0;
//        int pb = 0;
//        int pc = 0;
//    while(pa<na && pb<nb){
//        if(a[pa] <= b[pb])
//            buff[pc++] = b[pb++];
//        else
//            buff[pc++] = a[pa++];
//        }
//        while(pa<na)
//            buff[pc++] = a[pa++];
//        while(pb<nb)
//            buff[pc++] = a[pa++];
//    }
    public static void main(String[] args) {


    }
}