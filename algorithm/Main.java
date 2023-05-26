package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main{
    public static Map<Integer, Integer> store = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int rank = 0;
        store.put(0, arr[0]);
        for(int i = 1; i<N; i++){
            store.put(i, store.get(i-1) + arr[i]);
        }
        int time = 0;
        for(int i = 0; i<N; i++){
            time = store.get(i) + time;
        }
        System.out.println(time);
    }
}