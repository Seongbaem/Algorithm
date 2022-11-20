
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_13547_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            String str = br.readLine();
            int cnt = 15;
            cnt = cnt - str.length();

            for (int i = 0; i < str.length(); i++){
                if ('o' == str.charAt(i)){
                    cnt++;
                }
            }
            if (cnt > 7) {
                System.out.println("#" + (t + 1) + " YES");
                continue;
            }
            System.out.println("#" + (t + 1) + " NO");
        }
    }
}
