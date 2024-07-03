import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    // 여러 메서드에서 공유하는 변수의 경우, static 변수로 선언

    public static final int INF = (int) 1e9; // 무한하다는 뜻을 나타내는 수
    public static int N; // 입력 값
    public static int[][] graph; // 위치 및 가중치 저장하기 위한 2차원 배열 (ex. graph[0][2] = 4)
    public static int[][] d; // 특정 위치까지의 최소 비용을 저장하기 위한 2차원 배열
    public static ArrayList<Integer> resutlt;

    // 좌, 우, 하, 상
    public static int[] moveX = {-1, 1, 0, 0};
    public static int[] moveY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int now = 1;

        while (true) {
            N = Integer.parseInt(br.readLine());

            // 반복문 종료 조건
            if (N == 0) {
                break;
            }

            graph = new int[N][N];
            d = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                // d[i] 하위의 2차원 배열의 값을 무한대로 초기화
                Arrays.fill(d[i], INF);

                for (int j = 0; j < N; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dijkstra();

            sb.append("Problem ").append(now).append(": ").append(d[N - 1][N - 1]).append("\n");
            now++;
        }
        System.out.print(sb);
    }

    public static class Node implements Comparable<Node> {

        private int x;
        private int y;
        private int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        // 오름차순 정렬
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public static void dijkstra() {

        PriorityQueue<Node> pq = new PriorityQueue<>();

        // 시작 위치는 (0, 0) 위치와 해당 위치의 값(graph[0][0])
        pq.offer(new Node(0, 0, graph[0][0]));

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            // '현재 위치'에서 '상, 하, 좌, 우'를 확인하기 위해 4번 반복
            for (int i = 0; i < 4; i++) {
                int movedX = node.x + moveX[i];
                int movedY = node.y + moveY[i];

                // (0, 0) ~ (N - 1, N -1) 범위 벗어난 경우 체크
                if (movedX >= N || movedX < 0 || movedY >= N || movedY < 0) {
                    continue;
                }

                // 현재 위치까지의 비용(가중치) + 이동할 위치까지의 비용
                int updatedCost = node.cost + graph[movedX][movedY];

                // 최소 비용이 저장된 d 배열의 값과 비교해서 비용이 적을 경우
                if (d[movedX][movedY] > updatedCost) {
                    d[movedX][movedY] = updatedCost;

                    // 나중에 방문하기 위해 우선 순위 큐에 현재 위치 추가
                    pq.offer(new Node(movedX, movedY, updatedCost));
                }
            }
        }
    }

}