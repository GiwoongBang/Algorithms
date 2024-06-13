import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int inputLoop = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < inputLoop; i++) {
            hm.put(Integer.parseInt(st.nextToken()), 1);
        }

        int checkLoop = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < checkLoop; j++) {
            int num = Integer.parseInt(st.nextToken());
            if (hm.containsKey(num)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}