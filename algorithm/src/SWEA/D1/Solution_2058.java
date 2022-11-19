package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
