import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long tempA = Long.parseLong(st.nextToken());
        long tempB = Long.parseLong(st.nextToken());
        br.close();

        long A = Math.min(tempA, tempB);
        long B = Math.max(tempA, tempB);
        long sum = (A + B) * ((B - A + 1) / 2);

        if ((B - A) % 2 == 0) {
            sum += (A + B) / 2;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }

}