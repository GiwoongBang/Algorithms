import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int count;
    static int[] checked;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        checked = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            graph.get(U).add(V);
            graph.get(V).add(U);
        }
        br.close();

        for (int k = 0; k <= N; k++) {
            Collections.sort(graph.get(k));
        }

        count = 1;
        DFS(R);

        for (int s = 1; s < checked.length; s++) {
            bw.write(checked[s] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void DFS(int node) {
        checked[node] = count;

        for (int n = 0; n < graph.get(node).size(); n++) {
            int newNode = graph.get(node).get(n);
            if (checked[newNode] == 0) {
                count++;
                DFS(newNode);
            }
        }
    }

}