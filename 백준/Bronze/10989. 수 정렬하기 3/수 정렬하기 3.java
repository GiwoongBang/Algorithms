import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[10001];
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }

        for (int j = 0; j < 10001; j++) {
            while (nums[j] > 0) {
                sb.append(j).append("\n");
                nums[j]--;
            }
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}