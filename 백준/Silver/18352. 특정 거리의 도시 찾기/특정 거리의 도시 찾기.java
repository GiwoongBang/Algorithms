import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int cities, roads, distance, startCity;
    static int[] visited;
    static ArrayList<Integer>[] graph;
    static List<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        cities = Integer.parseInt(st.nextToken());
        roads = Integer.parseInt(st.nextToken());
        distance = Integer.parseInt(st.nextToken());
        startCity = Integer.parseInt(st.nextToken());

        graph = new ArrayList[cities + 1];
        visited = new int[cities + 1];
        result = new ArrayList<>();

        for (int i = 1; i <= cities; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int r = 1; r <= roads; r++) {
            st = new StringTokenizer(br.readLine());
            int departure = Integer.parseInt(st.nextToken());
            int arrival = Integer.parseInt(st.nextToken());
            graph[departure].add(arrival);
        }

        Arrays.fill(visited, -1);

        bfs(startCity);

        for (int s = 0; s <= cities; s++) {
            if (visited[s] == distance) result.add(s);
        }

        if (result.isEmpty()) {
            sb.append("-1");
        } else {
            Collections.sort(result);
            for (int num : result) {
                sb.append(num).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static void bfs(int startCity) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startCity);
        visited[startCity]++;

        while (!queue.isEmpty()) {
            Integer nowCity = queue.poll();
            for (int destination : graph[nowCity]) {
                if (visited[destination] == -1) {
                    visited[destination] = visited[nowCity] + 1;
                    queue.add(destination);
                }
            }
        }
    }

}
