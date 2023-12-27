import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (B > A) {
                int temp = A;
                A = B;
                B = temp;
            }

            int multi = 1;
            while(true) {
                int remain = (A * multi) % B;
                if (remain == 0) {
                    bw.write((A * multi) + "\n");
                    break;
                } else {
                    multi ++;
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }

}