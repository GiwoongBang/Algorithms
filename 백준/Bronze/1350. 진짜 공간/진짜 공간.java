import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int files = Integer.parseInt(br.readLine());

        int[] fileSize = new int[files];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < files; i++) {
            fileSize[i] = Integer.parseInt(st.nextToken());
        }

        int clusterSize = Integer.parseInt(br.readLine());
        br.close();

        long diskSize = 0;
        for (int j = 0; j < files; j++) {
            if (fileSize[j] > clusterSize && (fileSize[j] % clusterSize) != 0) {
                diskSize += ((long) (fileSize[j] / clusterSize) * clusterSize) + clusterSize;
            } else if (fileSize[j] > clusterSize && (fileSize[j] % clusterSize) == 0) {
                diskSize += ((long) (fileSize[j] / clusterSize) * clusterSize);
            } else if (fileSize[j] == 0) {
                continue;
            } else {
                diskSize += clusterSize;
            }
        }
        System.out.print(diskSize);

    }

}