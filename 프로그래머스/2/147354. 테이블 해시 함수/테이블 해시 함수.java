import java.util.Arrays;
import java.util.Comparator;

class Solution {
public int solution(int[][] data, int col, int row_begin, int row_end) {

        int answer = 0;

        // col 번째 기준으로 오름차순 정렬 > 값이 같으면 맨 앞의 숫자 기준으로 내림차순 정렬
        Arrays.sort(data, Comparator.comparingInt((int[] p) -> p[col - 1])
                .thenComparing((int[] p1, int[] p2) -> Integer.compare(p2[0], p1[0])));

        // 정렬된 hs에서 row_begin 부터 row-end까지 순환하면서 XOR 변환
        for (int i = row_begin - 1; i < row_end; i++) {
            int S_i = 0;
            int arrLength = data[i].length;
            for (int j = 0; j < arrLength; j++) {
                S_i += data[i][j] % (i + 1);
            }
            answer ^= S_i;
        }
        System.out.println(answer);
        return answer;
    }
}