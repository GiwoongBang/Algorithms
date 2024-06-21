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

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            switch (command) {
                case "push":
                    nums.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.pollFirst() + "\n");
                    }
                    break;

                case "size":
                    bw.write(nums.size() + "\n");
                    break;

                case "empty":
                    if(nums.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case "front":
                    if (nums.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(nums.peekFirst() + "\n");
                    }
                    break;

                case "back":
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