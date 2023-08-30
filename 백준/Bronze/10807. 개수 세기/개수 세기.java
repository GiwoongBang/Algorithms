import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int countNum;
        int checkNum;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        countNum = Integer.parseInt(br.readLine());
        int[] nums = new int[countNum];

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < countNum; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        checkNum = Integer.parseInt(br.readLine());
        br.close();

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkNum == nums[i]) {
                temp += 1;
            }
        }
        System.out.println(temp);
    }

}