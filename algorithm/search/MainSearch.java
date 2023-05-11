package algorithm.search;

import javax.security.auth.login.AppConfigurationEntry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MainSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int key = Integer.parseInt(br.readLine());
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SearchChoice searchChoice = new SearchChoice(new ArrSearch(arr, key));
        System.out.printf("인덱스 = %d", Arrays.binarySearch(arr, key));

    }
}