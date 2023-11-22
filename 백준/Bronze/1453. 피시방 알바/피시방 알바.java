import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] computers = new int[100];
        int result = 0;
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < N; i++) {
            int guest = Integer.parseInt(st.nextToken());

            computers[guest - 1]++;
        }

        for (int j = 0; j < 100; j++) {
            if (computers[j] >= 2) {
                result += computers[j] - 1;
            }
        }

        System.out.print(result);

    }

}