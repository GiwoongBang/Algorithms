import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<Character> PS = new Stack<>();
            char[] bracket = br.readLine().toCharArray();

            if (bracket[0] == ')' || bracket.length % 2 != 0) {
                bw.write("NO\n");
                continue;
            }

            boolean isPS = true;
            for (int b = 0; b < bracket.length; b++) {
                if (bracket[b] == '(') {
                    PS.push(bracket[b]);
                } else if (bracket[b] == ')' && !PS.isEmpty()) {
                    PS.pop();
                } else if (bracket[b] == ')' && PS.isEmpty()) {
                    isPS = false;
                    break;
                }
            }

            if (!isPS || PS.size() != 0) {
                bw.write("NO\n");
            } else {
                bw.write("YES\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}