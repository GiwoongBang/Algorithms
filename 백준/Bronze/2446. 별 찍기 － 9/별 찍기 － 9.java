import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            stars(N, i);
        }

        for (int j = N - 1; j >= 1; j--) {
            stars(N, j);
        }

    }

    private static void stars(int N, int i) {
        int starLoop = (2 * N) - ((2 * i) - 1);

        for (int t = 1; t < i; t++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= starLoop; k++) {
            if (k == starLoop) {
                System.out.println("*");
                break;
            } else {
                System.out.print("*");
            }
        }
    }

}