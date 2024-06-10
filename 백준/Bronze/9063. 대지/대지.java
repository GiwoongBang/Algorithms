import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dots = Integer.parseInt(br.readLine());
        if (dots == 1) {
            System.out.print(0);
        } else {

            int maxX = -10000;
            int maxY = -10000;
            int minX = 10000;
            int minY = 10000;

            StringTokenizer st;
            for (int i = 0; i < dots; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (x >= maxX) maxX = x;
                if (x <= minX) minX = x;
                if (y >= maxY) maxY = y;
                if (y <= minY) minY = y;
            }

            System.out.print((maxX - minX) * (maxY - minY));
        }
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}