import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        int[] seq = new int[A];
        int[] naturalOrder = new int[A];
        int[] reverseOrder = new int[A];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // naturalOrder 구하기
        for (int n = 0; n < A; n++) {
            naturalOrder[n] = 1;

            for (int m = 0; m < n; m++) {
                if (seq[m] < seq[n] && naturalOrder[n] <= naturalOrder[m]) {
                    naturalOrder[n] = naturalOrder[m] + 1;
                }
            }
        }

        //reverseOrder 구하기
        for (int r = A - 1; r >= 0; r--) {
            reverseOrder[r] = 1;

            for (int s = A - 1; s > r; s--) {
                if (seq[s] < seq[r] && reverseOrder[r] <= reverseOrder[s]) {
                    reverseOrder[r] = reverseOrder[s] + 1;
                }
            }
        }

        // 각 인덱스별의 합을 더한 후, 가장 큰 값에서 -1을 해줌.
        // -1을 하는 이유는 naturalOrder와 reverseOrder를 합칠 때,
        // 원소 1개씩 중복되어 있다고 함. 그래서 -1을 해줌.
        int max = 0;
        for (int t = 0; t < A; t++) {
            if (max < naturalOrder[t] + reverseOrder[t]) {
                max = naturalOrder[t] + reverseOrder[t];
            }
        }
        System.out.print(max - 1);

    }
}