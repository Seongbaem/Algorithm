import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_2056 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] a = {"01","03","05","07","08","10","12"} ;
        String[] b = {"04","06","09","11",};
        ArrayList<String> Months = new ArrayList<>(Arrays.asList(a));
        ArrayList<String> Months_2 = new ArrayList<>(Arrays.asList(b));

        for (int t = 0; t < T; t++){
            String str = br.readLine();
            boolean flag = true;

            String year = str.substring(0,4);
            String month = str.substring(4,6);
            String day = str.substring(6,8);
            if (0 > Integer.parseInt(year) || Integer.parseInt(year) > 9999){
                flag = false;
            }
                if (Months.contains(month)){
                    if (0 == Integer.parseInt(day) || Integer.parseInt(day) > 31){
                        flag = false;
                    }
                }
                else if(month.equals("02")){
                    if (0 == Integer.parseInt(day) || Integer.parseInt(day) > 28) {
                        flag = false;
                    }
                }
                else if(Months_2.contains(month)) {
                    if (0 == Integer.parseInt(day) || Integer.parseInt(day) > 30) {
                        flag = false;
                    }
                }

                if(Integer.parseInt(month) == 0 || Integer.parseInt(month) > 12){
                    flag = false;
                }
            if (flag){
                System.out.println("#"+(t+1)+" "+year+"/"+month+"/"+day);
            }
            else{
                System.out.println("#"+(t+1)+" "+-1);
            }
        }

    }
}
