import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;

        Integer N = Integer.parseInt(st.nextToken());
        Integer K = Integer.parseInt(st.nextToken());

        Queue<Integer> josephus = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            josephus.add(i);
        }

        int j = 1;
        while (!josephus.isEmpty()) {
            if (j % K != 0) {
                josephus.add(josephus.poll());
                j++;
            } else {
                results.add(josephus.poll());
                j++;
            }
        }

        sb = new StringBuilder();
        sb.append("<").append(results.get(0));
        for (int k = 1; k < N; k++) {
            sb.append(", ").append(results.get(k));
        }
        sb.append(">");
        System.out.print(sb);
    }
}