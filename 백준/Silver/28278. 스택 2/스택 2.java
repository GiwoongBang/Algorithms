import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack<Integer> nums = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    nums.push(num);
                    break;

                case 2:
                    if (nums.empty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.pop() + "\n");
                    }
                    break;

                case 3:
                    bw.write(nums.size() + "\n");
                    break;

                case 4:
                    if (nums.empty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case 5:
                    if (nums.empty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.peek() + "\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}