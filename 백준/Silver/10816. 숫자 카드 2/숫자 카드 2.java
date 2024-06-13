import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] nums = new int[20000001];

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            nums[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int m = 0; m < M; m++) {
            int idx = Integer.parseInt(st.nextToken());
            sb.append(nums[idx + 10000000]).append(" ");
        }

        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}