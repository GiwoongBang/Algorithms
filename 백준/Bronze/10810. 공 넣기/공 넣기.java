import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int bucketCount = Integer.parseInt(st.nextToken());
        int ballCount = Integer.parseInt(st.nextToken());

        int[] buckets = new int[bucketCount];

        for (int i = 0; i < ballCount; i++) {
            st = new StringTokenizer(br.readLine());
            int startBucket = Integer.parseInt(st.nextToken());
            int endBucket = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());

            for (int j = startBucket; j <= endBucket; j++) {
                buckets[j - 1] = ballNum;
            }
        }
        br.close();

        for (int i = 0; i < bucketCount; i++) {
            bw.write(buckets[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}