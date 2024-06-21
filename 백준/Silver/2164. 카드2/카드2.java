import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> cards = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.print(1);
        } else {
            for (int i = 1; i <= N; i++) {
                cards.add(i);
            }

            while (cards.size() > 1) {
                cards.poll();

                if (cards.size() == 1) {
                    System.out.print(cards.peek());
                    break;
                } else {
                    cards.add(cards.poll());
                }
            }
        }

    }
}