import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            char[] str = st.nextToken().toCharArray();

            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    bw.write(str[j]);
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}