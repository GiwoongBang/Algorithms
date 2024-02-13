import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int numberOfStarsPerLine = 2 * N;

        for (int i = 1; i <= N; i++) {
            stars(numberOfStarsPerLine, i);
        }

        for (int j = N - 1; j >= 1; j--) {
            stars(numberOfStarsPerLine, j);
        }

    }

    private static void stars(int numberOfStarsPerLine, int i) {
        for (int q = 0; q < i; q++) {
            System.out.print("*");
        }

        for (int w = 0; w < numberOfStarsPerLine - (2 * i); w++) {
            System.out.print(" ");
        }

        for (int e = 0; e < i; e++) {
            if (e == (i - 1)) {
                System.out.println("*");
                break;
            } else {
                System.out.print("*");
            }
        }
    }

}