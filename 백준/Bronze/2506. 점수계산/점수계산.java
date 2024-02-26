import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] marking = new int[loop];
        for (int i = 0; i < loop; i++) {
            marking[i] = Integer.parseInt(st.nextToken());
        }

        int score = 0;
        int now = 0;
        if (marking[0] == 1) {
            score = 1;
            now = 1;
        }
        for (int t = 1; t < loop; t++) {
            if (marking[t] == 0) {
                now = 0;
            }

            if (marking[t] == 1 && marking[t - 1] == 0) {
                now = 1;
                score += now;
            }

            if (marking[t] == 1 && marking[t - 1] == 1) {
                now++;
                score += now;
            }
        }
        System.out.print(score);

    }

}