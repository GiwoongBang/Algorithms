import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * progresses: 배포 순서
 * speeds: 개발 속도
 * <p>
 * ex1. [93, 30, 55], [1, 30, 5]        >>      [2, 1]
 */
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();

        Queue<Integer> progressesQue = new LinkedList<>();
        Queue<Integer> speedsQue = new LinkedList<>();

        for (Integer progress : progresses) progressesQue.add(progress);
        for (Integer speed : speeds) speedsQue.add(speed);

        while (!progressesQue.isEmpty()) {
            int size = progressesQue.size(); // 남아있는 사이즈만큼
            for (int i = 0; i < size; i++) {
                int added = progressesQue.poll() + speedsQue.peek();
                progressesQue.add(added);                   // [93, 30, 55] >> [60, 60, 94]
                speedsQue.add(speedsQue.poll());            // [1, 30, 5]   >> [30, 5, 1]
            }

            Integer complete = 0;
            while (!progressesQue.isEmpty() && progressesQue.peek() >= 100) {
                progressesQue.poll();
                speedsQue.poll();
                complete++;
            }

            if (complete > 0) {
                answer.add(complete);
            }
        }
        return answer;

    }
}