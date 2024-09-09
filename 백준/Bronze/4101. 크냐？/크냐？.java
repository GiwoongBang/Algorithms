import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left == 0 && right == 0) {
                break;
            }

            if (left > right) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
