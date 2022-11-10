import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Solution_1204 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++){
        int mode = 0;
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[1000];
        int[] index = new int[101];
        int max = 0;

        for (int k = 0; k < 1000; k++){
            arr[k] = Integer.parseInt(st.nextToken());
        }

        for (int m = 0; m < arr.length; m++){
            index[arr[m]]++;
        }
        for (int n = 0; n < index.length; n++){
            if(max<=index[n]){
                max = index[n];
                mode = n;
            }
        }
        System.out.println("#" + num + " " + mode);
    }

    }
}