import java.util.ArrayList;
import java.util.List;

/**
 * 1번: 1 2 3 4 5
 * 2번: 2 1 2 3 2 4 2 5
 * 3번: 3 3 1 1 2 2 4 4 5 5
 */
class Solution {
    public List<Integer> solution(int[] answer) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3]; // 1, 2, 3번 점수 체크
        for (int i = 0; i < answer.length; i++) {
            if (first[i % first.length] == answer[i]) scores[0]++;      // first.length = 5
            if (second[i % second.length] == answer[i]) scores[1]++;    // second.length = 8
            if (third[i % third.length] == answer[i]) scores[2]++;      // third.length = 10
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2])); // Math.max 함수 내부 중첩 가능

        List<Integer> result = new ArrayList<>(); // 가운데 ','를 위해 번거로운 작업을 하지 말고, return 타입을 int[] > List<Integer> 변경
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] == maxScore) result.add(j + 1);
        }

        return result;
    }
}