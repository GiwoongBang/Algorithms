import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int l = N; l >= 1; l--) {
            for (int i = 0; i < N - l; i++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * l) - 1; j++) {
                if (j == (2 * l) - 2) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }

    }

}