import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> nums = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                nums.pop();
            } else {
                nums.push(num);
            }
        }

        int resultSum = 0;
        int loop = nums.size();
        for (int s = 0; s < loop; s++) {
            resultSum += nums.pop();
        }
        System.out.print(resultSum);

    }
}