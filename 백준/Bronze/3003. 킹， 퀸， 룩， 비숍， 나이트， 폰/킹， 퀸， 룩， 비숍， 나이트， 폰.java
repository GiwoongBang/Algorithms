import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int[] chess = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < chess.length; i++) {
            chess[i] = chess[i] - Integer.parseInt(st.nextToken());
            bw.write(chess[i] + " ");
        }
        bw.flush();
        bw.close();

    }

}