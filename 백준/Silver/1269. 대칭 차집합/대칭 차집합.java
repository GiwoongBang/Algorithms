import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> groupA = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int a = 0; a < A; a++) {
            Integer num = Integer.parseInt(st.nextToken());
            groupA.put(num, num);
        }

        int diff = 0;

        int[] groupB = new int[B];
        st = new StringTokenizer(br.readLine());
        for (int b = 0; b < B; b++) {
            groupB[b] = Integer.parseInt(st.nextToken());
            if(groupA.containsKey(groupB[b])) diff ++;
        }

        System.out.print(groupA.size() - diff + groupB.length - diff);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}