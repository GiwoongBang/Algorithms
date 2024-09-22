import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int round = 1;
        int participants = Integer.parseInt(st.nextToken());
        int JIMIN = Integer.parseInt(st.nextToken());
        int HANSU = Integer.parseInt(st.nextToken());

        while (true) {
            JIMIN = checkRound(JIMIN);
            HANSU = checkRound(HANSU);
            if (JIMIN == HANSU) {
                System.out.print(round);
                break;
            }
            if (participants % 2 == 0) {
                participants /= 2;
            } else {
                participants = (participants / 2) + 1;
            }
            if (participants == 1 && participants % 2 == 0) {
                System.out.print(round);
                break;
            }
            round++;
        }
    }

    private static int checkRound(int participant) {
        int round;
        if (participant % 2 == 0) {
            round = participant / 2;
        } else {
            round = (participant / 2) + 1;
        }

        return round;
    }

}