import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int[] numArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        numArray[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numArray);

        for (int j = 0; j < numArray.length; j++) {
            System.out.print(numArray[j] + " ");
        }
    }
}