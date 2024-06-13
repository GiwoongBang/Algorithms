import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, String> names = new HashMap<>();
        List<String> result = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int cantHear = Integer.parseInt(st.nextToken());
        int cantSee = Integer.parseInt(st.nextToken());

        for (int h = 0; h < cantHear; h++) {
            String name = br.readLine();
            names.put(name, name);
        }

        for (int s = 0; s < cantSee; s++) {
            String name = br.readLine();
            if (names.containsKey(name)) result.add(name);
        }

        Collections.sort(result);
        sb.append(result.size()).append("\n");
        for (String resultName : result) {
            sb.append(resultName).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}