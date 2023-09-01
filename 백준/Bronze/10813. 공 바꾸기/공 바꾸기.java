import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int bucketCount = Integer.parseInt(st.nextToken());
        int shuffle = Integer.parseInt(st.nextToken());

        int[] buckets = new int[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = i + 1;
        }

        int temp;
        for (int i = 0; i < shuffle; i++) {
            st = new StringTokenizer(br.readLine());
            int bucketA = Integer.parseInt(st.nextToken()) - 1;
            int bucketB = Integer.parseInt(st.nextToken()) - 1;

            temp = buckets[bucketA];
            buckets[bucketA] = buckets[bucketB];
            buckets[bucketB] = temp;
        }
        br.close();

        for (int i = 0; i < bucketCount; i++) {
            bw.write(buckets[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}