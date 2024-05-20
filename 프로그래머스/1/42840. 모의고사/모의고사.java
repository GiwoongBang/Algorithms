import java.util.ArrayList;
import java.util.List;

class Solution {public List<Integer> solution(int[] answer) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];
        for (int i = 0; i < answer.length; i++) {
            if (first[i % first.length] == answer[i]) scores[0]++;
            if (second[i % second.length] == answer[i]) scores[1]++;
            if (third[i % third.length] == answer[i]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] == maxScore) result.add(j + 1);
        }

        return result;
    }
}