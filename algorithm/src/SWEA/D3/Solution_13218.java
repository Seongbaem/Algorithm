import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t= 0; t< T; t++){
            int a = Integer.parseInt(br.readLine());
            System.out.println("#"+(t+1)+" "+(a/3));
        }
    }
}
