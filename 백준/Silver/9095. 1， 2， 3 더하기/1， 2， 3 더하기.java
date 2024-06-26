import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1~10이 아닌 0~11에 해당하는 정수 배열 선언
        // 주어진 n은 11보다 작은 양의 정수(1~10)인데 굳이 1이 더 큰 배열(0~11)을 선언한 이유?
        // dpTable[0]은 사용하지 않으며, 추후 입력받을 n의 값과 dbTable 인덱스 수를 일치하기 위해
        int[] dpTable = new int[11];

        // 가장 간단한 Base Case는 직접 계산하여 값 할당
        dpTable[1] = 1; // 1
        dpTable[2] = 2; // 1 + 1    2
        dpTable[3] = 4; // 1 + 1 + 1    1 + 2   2 + 1   3

        // 주어진 n의 크기가 작으므로, Bottom-Up 방식으로 미리 계산
        for (int n = 4; n <= 10; n++) {
            // n에 해당하는 경우의 수인 dpTable[n] 미리 계산하여 값 할당
            dpTable[n] = dpTable[n - 3] + dpTable[n - 2] + dpTable[n - 1];
        }

        int loop = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        for (int i = 0; i < loop; i++) {
            int n = Integer.parseInt(br.readLine()); // input 값인 n 입력
            sb.append(dpTable[n]).append("\n"); // 미리 계산된 dpTable을 활용해 n에 해당하는 경우의 수 출력
        }
        System.out.print(sb);

    }

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}