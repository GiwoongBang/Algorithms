import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int scenario = 0;

        while (true) {
            int loop = Integer.parseInt(br.readLine());
            if (loop == 0) break;

            scenario++;
            String[] names = new String[loop + 1];
            for (int i = 1; i <= loop; i++) {
                names[i] = br.readLine();
            }

            Map<Integer, Integer> seized = new HashMap<>();
            for (int j = 0; j < (2 * loop) - 1; j++) {
                st = new StringTokenizer(br.readLine());
                int studentNum = Integer.parseInt(st.nextToken());
                char checkSeized = st.nextToken().charAt(0); // no use
                seized.put(studentNum, seized.getOrDefault(studentNum, 0) + 1);
            }

            for (int r = 1; r <= seized.size(); r++) {
                if (seized.get(r) == 1) {
                    bw.write(scenario + " " + names[r] + "\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }


}