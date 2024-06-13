import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int[] origin = new int[loop];
        int[] sorted = new int[loop];
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < loop; i++) {
            int num = Integer.parseInt(st.nextToken());
            origin[i] = num;
            sorted[i] = num;
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int n : sorted) {
            if (!nums.containsKey(n)) {
                nums.put(n, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n : origin) {
            Integer ranking = nums.get(n);
            sb.append(ranking).append(" ");
        }
        System.out.print(sb);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}