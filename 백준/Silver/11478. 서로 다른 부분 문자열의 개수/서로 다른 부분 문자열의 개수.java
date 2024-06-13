import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        HashSet<String> hs = new HashSet<>();
        int loop = input.length();
        int gap = 1;
        while (loop > 0) {
            int tempGap = gap;
            for (int i = 0; i < loop; i++) {
                String str = input.substring(i, tempGap);
                hs.add(str);
                tempGap++;
            }
            loop--;
            gap++;
        }
        System.out.print(hs.size());
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}