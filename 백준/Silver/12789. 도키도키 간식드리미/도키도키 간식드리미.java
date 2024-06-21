import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> mainLine = new LinkedList<>();
        Stack<Integer> subLine = new Stack<>();

        int students = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < students; i++) {
            mainLine.add(Integer.parseInt(st.nextToken()));
        }

        boolean isNice = true;
        int now = 1;
        while (now <= students) {
            if (!mainLine.isEmpty()) {
                if (mainLine.peek().equals(now)) {
                    mainLine.poll();
                    now++;
                    continue;
                }
            }

            if (!subLine.isEmpty()) {
                if (subLine.peek().equals(now)) {
                    subLine.pop();
                    now++;
                    continue;
                }
            }

            if (!mainLine.isEmpty()) {
                subLine.push(mainLine.poll());
            }

            if (mainLine.isEmpty() && subLine.peek() != now) {
                isNice = false;
                break;
            }
        }

        if (!isNice) {
            System.out.print("Sad");
        } else if (mainLine.isEmpty() && subLine.isEmpty()) {
            System.out.print("Nice");
        }
    }
}