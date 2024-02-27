import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < loop; i++) {
            for (int k = 0; k <= i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int j = loop - 1; j > 0; j--) {
            for (int t = 0; t < j; t++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}