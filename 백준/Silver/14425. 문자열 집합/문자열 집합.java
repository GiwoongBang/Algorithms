import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hm.put(br.readLine(), 1);
        }

        int result = 0;
        for (int j = 0; j < M; j++) {
            if (hm.containsKey(br.readLine())) result++;
        }

        System.out.print(result);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}