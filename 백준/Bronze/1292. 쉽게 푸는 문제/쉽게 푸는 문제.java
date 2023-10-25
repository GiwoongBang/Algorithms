import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                ++count;
                if (count > end) break;
                if (count >= start) sum += i;
            }
            if (count > end) break;
        }

        System.out.print(sum);

    }

}