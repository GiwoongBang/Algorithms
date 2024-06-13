import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int days = 1;
        if (up < height) {
            int additionalDays = (height - up) / (up - down);
            if (additionalDays < 1 || (height - up) % (up - down) != 0) additionalDays ++;
            days += additionalDays;
        }
        System.out.print(days);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}