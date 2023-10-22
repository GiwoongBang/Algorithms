import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int YSPay = 10;
        int MSPay = 15;
        int YSPrice = 0;
        int MSPrice = 0;

        int testCase = Integer.parseInt(br.readLine());
        int[] callingTime = new int[testCase];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testCase; i++) {
            callingTime[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int y = 0; y < testCase; y++) {
            int checkPrice = callingTime[y] / 30;
            YSPrice += YSPay + (10 * checkPrice);
        }

        for (int m = 0; m < testCase; m++) {
            int checkPrice = callingTime[m] / 60;
            MSPrice += MSPay + (15 * checkPrice);
        }

        String name = "Y ";
        int price = YSPrice;
        if (YSPrice > MSPrice) {
            name = "M ";
            price = MSPrice;
        } else if (YSPrice == MSPrice) {
            name = "Y M ";

        }

        bw.write(name + price);
        bw.flush();
        bw.close();

    }

}