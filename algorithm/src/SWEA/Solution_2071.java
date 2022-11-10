package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution_2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[10];
            int sum = 0;
            float average = 0.0f;
            for (int k = 0; k < 10; k++){
                arr[k] = Integer.parseInt(st.nextToken());
            }

            for (int m = 0; m < 10; m++){
                sum += arr[m];
            }
            average = sum / 10;
            System.out.printf("#%d %f",i+1,average);
            System.out.println("");
        }

    }
}
