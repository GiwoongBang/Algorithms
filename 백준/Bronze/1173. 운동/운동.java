import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int requiredTime = Integer.parseInt(st.nextToken());
        int minRate = Integer.parseInt(st.nextToken());
        int maxRate = Integer.parseInt(st.nextToken());
        int working = Integer.parseInt(st.nextToken());
        int rest = Integer.parseInt(st.nextToken());
        br.close();

        int nowRate = minRate;
        int countWorking = 0;
        int countRest = 0;


        if (nowRate <= maxRate && (nowRate + working) > maxRate) {
            System.out.println(-1);
        } else {
            while (requiredTime != countWorking) {
                int add = nowRate + working;

                if (add <= maxRate) {
                    nowRate = add;
                    countWorking++;
                } else {
                    int minus = nowRate - rest;
                    if (minus < minRate) {
                        nowRate = minRate;
                    } else {
                        nowRate -= rest;
                    }
                    countRest++;
                }
            }
            System.out.print(countWorking + countRest);
        }

    }

}