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
            int index = 0;
            int size = progressesQue.size();
            while (size > index) {
                Integer speed = speedsQue.poll();
                int added = progressesQue.poll() + speed;
                progressesQue.add(added);
                speedsQue.add(speed);
                index++;
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

//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] progresses1 = {93, 30, 55};
//        int[] speeds1 = {1, 30, 5};
//        System.out.println(sol.solution(progresses1, speeds1));  // [2, 1]
//
//        int[] progresses2 = {95, 90, 99, 99, 80, 99};
//        int[] speeds2 = {1, 1, 1, 1, 1, 1};
//        System.out.println(sol.solution(progresses2, speeds2));  // [1, 3, 2]
//    }
}