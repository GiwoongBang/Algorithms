import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixedCost = Integer.parseInt(st.nextToken());
        int variableCost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        if (variableCost >= price) {
            bw.write(String.valueOf(-1));
            bw.flush();
            bw.close();
        } else {
            int benefit = price - variableCost;
            int count = 0;
            while(fixedCost >= 0) {
                ++ count;
                fixedCost -= benefit;
            }
            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
        }

    }

}