import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String strA = st.nextToken();
        String strB = st.nextToken();
        char[] arrayA = strA.toCharArray();
        char[] arrayB = strB.toCharArray();

        int indexA = Integer.MAX_VALUE;
        int indexB = Integer.MAX_VALUE;
        for (int a = 0; a < arrayA.length; a++) {
            for (int b = 0; b < arrayB.length; b++) {
                if (arrayA[a] == arrayB[b]) {
                    indexA = a;
                    indexB = b;
                    break;
                }
            }
            if (indexA != Integer.MAX_VALUE) break;
        }

        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
                if (i == indexB) {
                    bw.write(strA);
                    break;
                } else {
                    if (j == indexA) {
                        bw.write(arrayB[i]);
                    } else {
                        bw.write('.');
                    }
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}