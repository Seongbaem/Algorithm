package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_13428_not {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            String str = br.readLine();
            String[] arr = str.split("");

            int max = Integer.parseInt(str);

            for (int k = arr.length-1; k > 0; k--) {
                for (int m = 0; m < k; m++) {
                    int last_num = Integer.parseInt(arr[k]);
                    int first_num = Integer.parseInt(arr[m]);
                    String[] arr_1 = str.split("");

                    if (last_num > first_num) {
                        arr_1[m] = arr[k];
                        arr_1[k] = arr[m];
                    }

                    if (Integer.parseInt(String.join("", arr_1)) > max) {
                        max = Integer.parseInt(String.join("", arr_1));
                    }
                }
            }

                int min = Integer.parseInt(str);

                for (int a = arr.length - 1; a > 0; a--) {
                    for (int b = 0; b < a; b++) {
                        int last_num = Integer.parseInt(arr[a]);
                        int first_num = Integer.parseInt(arr[b]);
                        String[] arr_2 = str.split("");

                        if (last_num ==0){
                            continue;
                        }
                        if (last_num < first_num) {
                            arr_2[b] = arr[a];
                            arr_2[a] = arr[b];
                        }

                        if (Integer.parseInt(String.join("", arr_2)) < min) {
                            min = Integer.parseInt(String.join("", arr_2));
                        }
                    }
                }
                System.out.printf("#%d %d %d\n", i + 1, min, max);
//                    System.out.printf("#%d %d %d\n", i + 1, Integer.parseInt(str), Integer.parseInt(str));

            }
        }
    }

