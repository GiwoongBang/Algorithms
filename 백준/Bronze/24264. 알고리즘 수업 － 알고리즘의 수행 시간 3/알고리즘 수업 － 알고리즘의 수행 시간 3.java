import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        /*
        MenOfPassion(A[], n) {
        for i <- 1 to n
            for j <- 1 to n
                sum <- sum + A[i] × A[j]; # 코드1
        return sum;
        }

        반복문(for문)이 2번 중첩되므로 코드 1은 n^2번 실행되며, 시간복잡도는 O(n^2)이므로 최고차항은 2.
         */
        System.out.println(n * n);
        System.out.print(2);

    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}