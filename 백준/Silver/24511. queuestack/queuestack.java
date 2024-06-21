import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> deq = new ArrayDeque<>();

        int dsCount = Integer.parseInt(br.readLine());
        int[] ds = new int[dsCount];
        st = new StringTokenizer(br.readLine());
        for (int d = 0; d < dsCount; d++) {
            ds[d] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < dsCount; n++) {
            int dsNum = Integer.parseInt(st.nextToken());
            if (ds[n] == 0) deq.add(dsNum);
        }

        int elementCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int e = 0; e < elementCount; e++) {
            deq.offerFirst(Integer.parseInt(st.nextToken()));
            sb.append(deq.pollLast()).append(" ");
        }
        System.out.print(sb);

    }
}