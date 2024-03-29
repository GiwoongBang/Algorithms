import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int starCount = Integer.parseInt(br.readLine());

        for (int i = 1; i <= starCount; i++) {
            for (int j = 1; j <= starCount; j++) {
                if (j <= (starCount - i)) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}