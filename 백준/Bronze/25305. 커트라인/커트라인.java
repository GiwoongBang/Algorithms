import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    이진 검색 트리: https://www.acmicpc.net/problem/5639
 */
public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int students = Integer.parseInt(st.nextToken());
        int winners = Integer.parseInt(st.nextToken());

        Integer[] scores = new Integer[students];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < students; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores, Collections.reverseOrder());
        System.out.print(scores[winners - 1]);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}