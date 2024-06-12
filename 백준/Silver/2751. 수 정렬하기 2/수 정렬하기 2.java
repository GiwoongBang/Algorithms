import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] nums = new boolean[2000001];
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            nums[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j]) {
                sb.append(j - 1000000).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}