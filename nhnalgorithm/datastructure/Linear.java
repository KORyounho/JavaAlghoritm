package nhnalgorithm.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Linear {
    public static int []arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N1 = Integer.parseInt(br.readLine());
        int [] arr1 = new int[N1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int N2 = Integer.parseInt(br.readLine());

        int [] arr2 = new int[N2];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int [] result = new int[N2];
        Arrays.sort(arr2);
        Arrays.sort(arr1);

        for(int i = 0; i<N2; i++){
            int left = 0;
            int right = N2;
            int mid = (left+right)/2;
            
        }

        for (int i : result){
            System.out.println(i);
        }
    }
}




