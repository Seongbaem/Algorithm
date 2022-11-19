package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_14361 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // input 값을 곱하였을 때  자릿수 변화 없을 정도에 배수를 만들고 배수의 값이 input 값을 contains 하면 true 아니면 false
            int num = Integer.parseInt(br.readLine());
            String str = Integer.toString(num);
            boolean flag = true;

            for (int m = 2; m < 10; m++) {
                String std = Integer.toString(num*m);
                if (std.length() != str.length()){
                    flag = false;
                    break;
                }

                for (int k = 0; k < std.length(); k++){
                    if(!std.contains(String.valueOf(str.charAt(k)))) {
                        flag = false;
                        break;
                    }
                }

                if(flag==true) {
                    break;
                }
            }
            System.out.printf("#%d %s\n", i+1, flag ? "possible" : "impossible");
        }





    }
}
