import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution_2072 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[10];
        int[] result = new int[num];

        for (int k = 0; k < num; k++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 10; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a % 2 != 0) {
                    sum += a;
                }
            }
            result[k] = sum;
        }
        for (int k = 1; k <= num; k++){
            System.out.println("#" + k + " " + result[k-1]);
        }

    }
}