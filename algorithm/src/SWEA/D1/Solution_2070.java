import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] num_arr = new int[2];
        for (int i = 0; i < T; i++){
            String[] arr = (br.readLine().split(" "));
            for (int k = 0; k < 2; k++){
                num_arr[k] = Integer.parseInt(arr[k]);
            }

            if (num_arr[0] > num_arr[1]){
                System.out.printf("#%d >\n",i+1);
            }
            else if (num_arr[0] < num_arr[1]){
                System.out.printf("#%d <\n",i+1);
            }
            else if (num_arr[0] == num_arr[1]){
                System.out.printf("#%d =\n",i+1);
            }

        }
    }
}
