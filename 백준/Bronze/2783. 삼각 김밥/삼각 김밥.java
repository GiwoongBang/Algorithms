import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] seven25 = br.readLine().split(" ");
        int minPrice = Integer.parseInt(seven25[0]);
        double minGram = Integer.parseInt(seven25[1]);
        double minAvg = minPrice / minGram;

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            double gram = Integer.parseInt(st.nextToken());
            double avg = price / gram;

            if (minAvg > avg) {
                minPrice = price;
                minGram = gram;
                minAvg = avg;
            }
        }
        double result = (1000 / minGram) * minPrice;
        System.out.printf("%.2f", result);
    }
}