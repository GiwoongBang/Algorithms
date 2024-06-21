import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> nums = new ArrayDeque<>();
        Deque<Integer> idx = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
            idx.add(i + 1);
        }

        Integer nowMove = nums.poll();
        Integer nowIdx = idx.poll();
        sb.append(nowIdx).append(" ");

        while (nums.size() > 1) {
            if (nowMove > 0) {
                for (int m = 0; m < nowMove - 1; m++) {
                    nums.offerLast(nums.pollFirst());
                    idx.offerLast(idx.pollFirst());
                }
                nowMove = nums.poll();
                nowIdx = idx.poll();
                sb.append(nowIdx).append(" ");
            } else {
                int abs = Math.abs(nowMove);
                for (int m = 0; m < abs - 1; m++) {
                    nums.offerFirst(nums.pollLast());
                    idx.offerFirst(idx.pollLast());
                }
                nowMove = nums.pollLast();
                nowIdx = idx.pollLast();
                sb.append(nowIdx).append(" ");
            }
        }
        sb.append(idx.poll());
        System.out.print(sb);

    }
}