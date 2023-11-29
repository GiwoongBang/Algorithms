import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        while(N != 0) {
            int K = 1;
            for (int i = 0; i < N; i++) {
                if (N >= K) {
                    N -= K;
                    K++;
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.print(count);

    }

}