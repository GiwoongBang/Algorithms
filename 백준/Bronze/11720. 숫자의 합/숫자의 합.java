import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] nums = new int[count];

        String[] splitNum = br.readLine().split("");
        br.close();

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(splitNum[i]);
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += nums[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

}