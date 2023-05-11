package algorithm.sort;

public class SortMain {
    public static void main(String[] args) {
        int []arr = {5, 6, 1, 7, 8, 2, 3, 9, 4};

        Sort sort_bubble = new Sort(arr);
        Sort sort_insert = new Sort(arr);
        Sort sort_select = new Sort(arr);

        sort_bubble.bubbleSort();

        System.out.println("bubble sort");
        for(int i = 0; i<9; i++){
            System.out.printf("%d번째 = %d\n", i, sort_bubble.getArrInd(i));
        }
        sort_select.selectSort();
        System.out.println("select sort");
        for(int i = 0; i<9; i++){
            System.out.printf("%d번째 = %d\n", i, sort_select.getArrInd(i));
        }
        sort_insert.insertSort();
        System.out.println("insert sort");
        for(int i = 0; i<9; i++){
            System.out.printf("%d번째 = %d\n", i, sort_insert.getArrInd(i));
        }
    }


}
