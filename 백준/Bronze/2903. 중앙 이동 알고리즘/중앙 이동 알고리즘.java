import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        double square = Math.pow(2, count) + 1;

        int result = (int) Math.pow(square, 2);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}