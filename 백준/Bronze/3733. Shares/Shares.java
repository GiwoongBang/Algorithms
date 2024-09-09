import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            String input = br.readLine();
            if (input == null || input.trim().isEmpty()) break;

            st = new StringTokenizer(input);
            int participant = Integer.parseInt(st.nextToken());
            int stocks = Integer.parseInt(st.nextToken());

            int result = stocks / (participant + 1);

            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
