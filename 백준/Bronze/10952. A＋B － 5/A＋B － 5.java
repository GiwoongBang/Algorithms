import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a ==0 && b ==0) {
                break;
            }

                bw.write((a + b) + "\n");
        }
        while (true);

        br.close();
        bw.flush();
        bw.close();
    }

}