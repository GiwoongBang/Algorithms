import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int loop = N;
        for (int i = 0; i < N; i++) {
            int checkBlank = loop;
            while (N - checkBlank > 0) {
                System.out.print(" ");
                checkBlank ++;
            }
            for (int j = 0; j < loop; j++) {
                if (j == loop - 1) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
            loop--;
        }

    }

}