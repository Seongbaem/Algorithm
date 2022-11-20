import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            // 글자수 같은 경우 각 자리가 같으면 Y / 다른 경우 Q의 값이 P의 i+1 값이 아니면 N
            // 글자수 다른 경우 P 기준으로 다 같은지 그리고 Q가 a인지.

            String a = br.readLine();
            String b = br.readLine();


        }
    }
}
