import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(arr));
        for (int t = 0; t < T; t++) {
            String a = br.readLine();
            int b = lst.indexOf(a);
            if (b==6) {
                System.out.println("#"+(t+1)+" "+7);
                continue;
            } else {
                System.out.println("#"+(t+1)+" "+(6-b));
            }

            }
        }
    }

