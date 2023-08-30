import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        br.close();

        for (int i = 0; i < countNum; i++) {
            int temp = Integer.parseInt(st.nextToken());

            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }

}