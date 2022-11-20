import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_12741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();
        for (int t = 1; t<=T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String str = br.readLine();

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (b < c){
                lst.add(0);
            }
            else if (b >= c){
                if (b > d) {
                    lst.add(d-c);
                }
                else if (b < d) {
                    lst.add(b-c);
                }
            }
        }
        for (int i = 0; i < T; i++){
            System.out.println("#"+(i+1)+" "+lst.get(i));
        }
    }
}
