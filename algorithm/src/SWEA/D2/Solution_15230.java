package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_15230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        String str = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < T; i++){
            String a = br.readLine();
            int count = 0;
            for (int k = 0; k < a.length(); k++){
                if(a.charAt(k) == str.charAt(k)){
                    count++;
                }
                else{
                    break;
                }
            }
            arr[i] = count;
        }
        for (int m = 0; m < T; m++){
            System.out.printf("#%d %d\n",m+1,arr[m]);

        }
    }

}
