import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*
        MenOfPassion(A[], n) {
         sum <- 0;
         for i <- 1 to n
        sum <- sum + A[i]; # 코드1
        return sum;
        }

        반복문(for문)에 의해 코드 1은 n번 실행되며, 시간복잡도는 O(n)이므로 최고차항은 1.
         */
        System.out.println(n);
        System.out.print(1);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}