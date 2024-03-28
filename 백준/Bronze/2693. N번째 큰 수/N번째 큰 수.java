import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            Integer[] nums = new Integer[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nums, Collections.reverseOrder());
            System.out.println(nums[2]);
        }

    }
}