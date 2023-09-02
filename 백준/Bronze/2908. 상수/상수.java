import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = new String[2];
        String[] dividedStr = new String[3];
        int[] compare = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input.length; i++) {
            input[i] = st.nextToken();
            dividedStr = input[i].split("");

            String temp = dividedStr[0];
            dividedStr[0] = dividedStr[2];
            dividedStr[2] = temp;

            String tempStr = "";
            for (int k = 0; k < dividedStr.length; k++) {
                tempStr += dividedStr[k];
            }

            compare[i] = Integer.parseInt(tempStr);
        }
        br.close();

        int max = Math.max(compare[0], compare[1]);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }

}