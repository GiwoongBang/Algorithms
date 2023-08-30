import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int order = 0;

        for (int i = 0; i < 9; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp > max) {
                max = temp;
                order = i + 1;
            }
        }
        bw.write(max + "\n" + order);
        bw.flush();
        bw.close();

    }

}