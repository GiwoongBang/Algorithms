import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        int brokenLine = 0;
        while (true) {
            if (brokenLine % 2 == 0) {
                if(M >= 1 && N >= 1) {
                    brokenLine += 1;
                    M --;
                } else {
                    break;
                }
            } else {
                if(M >= 1 && N >= 1) {
                    brokenLine += 1;
                    N --;
                } else {
                    break;
                }
            }

        }
        bw.write(String.valueOf(brokenLine - 1));
        bw.flush();
        bw.close();

    }

}