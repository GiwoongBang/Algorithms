import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    상근이의 여행: https://www.acmicpc.net/problem/9372
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());

        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            int nation = Integer.parseInt(st.nextToken());
            int plane = Integer.parseInt(st.nextToken());

            for (int j = 0; j < plane; j++) {
                br.readLine();
            }
            System.out.println(nation - 1);
        }

    }
}