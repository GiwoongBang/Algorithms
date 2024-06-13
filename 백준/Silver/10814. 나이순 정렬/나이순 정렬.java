import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        StringBuilder[] ages = new StringBuilder[201];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = new StringBuilder();
        }

        int loop = Integer.parseInt(br.readLine());
        for (int j = 0; j < loop; j++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            ages[age].append(age).append(" ").append(name).append("\n");
        }

        for (int k = 0; k < ages.length; k++) {
            sb.append(ages[k]);
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}