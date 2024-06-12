import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] inputNums = br.readLine().toCharArray();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < inputNums.length; i++) {
            nums.add(Integer.parseInt(String.valueOf(inputNums[i])));
        }

        Collections.sort(nums, Collections.reverseOrder());
        for (int j = 0; j < nums.size(); j++) {
            sb.append(nums.get(j));
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}