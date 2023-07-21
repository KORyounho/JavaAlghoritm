package nhnalgorithm.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int N2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Arrays.sort(arr1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N2; i++) {

            if (search(arr1, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else
                sb.append(0).append('\n');
        }

        System.out.println(sb);
    }
    public static int search(int[] arr, int target) {
            int lp = 0;
            int rp = arr.length - 1;
            int p;
            while (lp<=rp) {
                p = (lp + rp) / 2;
                if (target > arr[p]) {
                    lp = p+1;
                } else if (target < arr[p]) {
                    rp = p-1;
                } else {
                    return p;
                }
            }
            return -1;
        }
    }




