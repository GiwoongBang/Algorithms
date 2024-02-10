import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int loop = N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < loop; j++) {
                if (j == (loop - 1)) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
            loop--;
        }

    }

}