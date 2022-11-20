import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solution_2001 {
    static int N, M, max;
    static int[][] area;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            area = new int[N][N];
            max = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st_2 = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < N; k++) {
                    area[i][k] = Integer.parseInt(st_2.nextToken());
                }
            }

            for (int m = 0; m <= N - M; m++) {
                for (int n = 0; n <= N - M; n++) {
                    getResult(m, n);
                }
            }
            System.out.println("#" + t + " " + max);
        }
    }

    static void getResult(int m, int n) {
        int sum = 0;
        for (int i = m; i < i + M; i++) {
            for (int k = n; k < k + M; k++) {
                sum += area[i][k];
            }
        }
        if (sum > max) {
            max = sum;
        }
    }
}
