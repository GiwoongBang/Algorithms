import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> nums = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    nums.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    nums.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case 3:
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.pollFirst() + "\n");
                    }
                    break;

                case 4:
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.pollLast() + "\n");
                    }
                    break;

                case 5:
                    bw.write(nums.size() + "\n");
                    break;

                case 6:
                    if (nums.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case 7:
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.peekFirst() + "\n");
                    }
                    break;

                case 8:
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.peekLast() + "\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}