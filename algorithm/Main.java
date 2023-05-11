package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[][] User = new String[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            User[i][0] = st.nextToken();
            User[i][1] = st.nextToken();
        }

        Arrays.sort(User, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return Integer.parseInt(e1[1]) - Integer.parseInt(e2[1]);
            }
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });
        for (int i = 0; i < n; i++) {
            System.out.println(User[i][0] + " " + User[i][1]);
        }
    }
}


