
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_14178 {
    // 안 나누어 떨어지면 N보다 작은값 + 1
    // 나누어 떨어지면 % == 0이면 그 값 그대로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        float answer = 0;

        for (int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int M = D*2+1;
            int i = 1;
            boolean flag = true;
            if (N % (M) == 0){
                answer = (N / (M));
                System.out.println("#"+(t+1)+" "+(int)answer);
                continue;
            }

            while(flag){
                if (N < M * i){
                    flag = false;
                    System.out.println("#"+(t+1)+" "+i);
                }
                i++;
            }
        }


    }


}
