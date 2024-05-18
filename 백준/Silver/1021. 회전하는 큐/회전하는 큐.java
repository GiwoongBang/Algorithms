import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> deque = new LinkedList<>();

        int count = 0; // 2, 3번 연산 횟수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        int[] targetNums = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            targetNums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int haliIdx;
            if (deque.size() % 2 == 1) {
                haliIdx = deque.size() / 2;
            } else {
                haliIdx = deque.size() / 2 - 1; // {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10}        index 5 = 6      halfIdx는 -1을 해서 index 4 = 5
            }

            int targetIdx = deque.indexOf(targetNums[i]);

            if (targetIdx <= haliIdx) {
                for (int j = 0; j < targetIdx; j++) {
                    int temp = deque.pollFirst(); // {2, 3, 4, 5, 6, 7, 8, 9 , 10}, size = 9
                    deque.offerLast(temp); // {2, 3, 4, 5, 6, 7, 8, 9 , 10, 1}, size = 10
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - targetIdx; j++) { // {3, 4, 5, 6, 7, 8, 9 , 10, 1}, targetIndx = 6
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
            // {3, 4, 5, 6, 7, 8, 9 , 10, 1}, size = 9
            // {10, 1, 3, 4, 5, 6, 7, 8}, size = 8
        }

        System.out.println(count);

    }
}