import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, Integer> hm = new HashMap<>();

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String access = st.nextToken();

            if(access.equals("enter")) {
                hm.put(name, 1);
            } else {
                hm.remove(name);
            }
        }

        List<String> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for (String worker : list) {
            sb.append(worker).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}