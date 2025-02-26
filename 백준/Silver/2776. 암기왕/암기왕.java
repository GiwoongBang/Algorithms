import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int firstNotebook = Integer.parseInt(st.nextToken());
            int[] firstNotebookNums = new int[firstNotebook];

            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < firstNotebook; l++) {
                firstNotebookNums[l] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(firstNotebookNums);

            st = new StringTokenizer(br.readLine());
            int secondNotebook = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < secondNotebook; l++) {
                int value = Integer.parseInt(st.nextToken());

                int left = 0;
                int right = firstNotebook - 1;
                boolean found = false;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (firstNotebookNums[mid] == value) {
                        found = true;

                        break;
                    }

                    if (firstNotebookNums[mid] > value) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                if (found) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}