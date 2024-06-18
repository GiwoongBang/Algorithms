import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int[] nowTrees = new int[loop];

        for (int i = 0; i < loop; i++) {
            nowTrees[i] = Integer.parseInt(br.readLine());
        }

        int GCD = 0;
        for (int t = 0; t < loop - 1; t++) {
            int gap = nowTrees[t + 1] - nowTrees[t];
            if (gap > GCD) {
                GCD = euclidean(gap, GCD);
            } else if (gap < GCD) {
                GCD = euclidean(GCD, gap);
            }
        }

        int allTrees = ((nowTrees[loop - 1] - nowTrees[0]) / GCD) + 1;
        System.out.print(allTrees - nowTrees.length);
    }

    static int euclidean(int A, int B) {
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }
        return A;
    }

}