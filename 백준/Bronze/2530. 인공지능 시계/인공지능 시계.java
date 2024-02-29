import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int cookTime = Integer.parseInt(br.readLine());
        br.close();

        second += cookTime;
        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }

        if (minute >= 60) {
            time += minute / 60;
            minute = minute % 60;
        }

        if (time >= 24) {
            time %= 24;
        }

        System.out.print(time + " " + minute + " " + second);
    }

}