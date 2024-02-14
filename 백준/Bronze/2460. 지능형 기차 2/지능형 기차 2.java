import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int now = 0;
        int station = 10;
        
        for (int i = 0; i < station; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int getOff = Integer.parseInt(st.nextToken());
            int getOn = Integer.parseInt(st.nextToken());

            now -= getOff;
            if (now > max) max = now;

            now += getOn;
            if (now > max) max = now;
        }

        System.out.print(max);
    }

}