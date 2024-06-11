import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*
        MenOfPassion(A[], n) {
        i = ⌊n / 2⌋;
        return A[i]; # 코드1
        }

        반복문이 없으므로, 코드1은 무조건 1번 실행되며, 시간복잡도는 O(1)을 가진다.
         */
        System.out.println(1);
        System.out.print(0);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}