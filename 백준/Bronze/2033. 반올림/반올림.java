import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        if(N < 10) {
            System.out.println(N);
        } else {
            ArrayList<Integer> nums = new ArrayList<>();
            while (N != 0) {
                int remain = N % 10;
                N /= 10;

                if (remain >= 5) N++;
                nums.add(0);

                if (N < 10) {
                    nums.add(N);
                    break;
                }
            }

            for (int i = nums.size() - 1; i >= 0; i--) {
                System.out.print(nums.get(i));
            }
        }

    }

}