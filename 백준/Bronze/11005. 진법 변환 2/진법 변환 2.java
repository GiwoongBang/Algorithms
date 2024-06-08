import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String result = Integer.toString(N, B).toUpperCase();
        System.out.print(result);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}