package algorithm.sort;

public class Sort {
    private static int[] arr;

    Sort(int arr[]) {
        this.arr = arr;
    }

    ;

    public int getArrInd(int i) {
        return arr[i];
    }

    public int[] getArr() {
        return arr;
    }

    public static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort() {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void insertSort() {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static void ShellSort() {
        int h;
        for (h = 1; arr.length < h; h = h * 3 + 1)
            for (; h > 0; h /= 3) {
                for (int i = h; i < arr.length; i++) {
                    int j;
                    int tmp = arr[i];
                    for (j = i; j >= 0 && arr[j] > tmp; j -= h) {
                        arr[j + h] = arr[j];
                    }
                    arr[j + h] = tmp;
                }
            }
    }

    //    public static void Partition(int arr[], ){
//        int pl = 0;
//        int pr = arr.length-1;
//        int x = arr[(pl+pr)/2];
//
//        do{
//            while(arr[pl] < x) pl++;
//            while(arr[pr] > x) pr++;
//            swap(arr, pl, pr);
//        }while(pl<=pr);
//    }
    public static void QuickSort(int[] arr, int left, int right) {

        int pl = left;
        int pr = right;
        int x = arr[(right+left)/2];

        do{
            while(arr[pl] < x) pl++;
            while(arr[pr] > x) pr--;
            if(pl > pr)
                swap(arr, pl++, pr--);
        }while(pl <= pr);

        if(left<pr) QuickSort(arr, left, pr);
        if(pl<right) QuickSort(arr, pl, right);
    }
}


//    public void merge(){
//
//    }
//
//           while(true){
//
//           }
//       }
//   }
//}
