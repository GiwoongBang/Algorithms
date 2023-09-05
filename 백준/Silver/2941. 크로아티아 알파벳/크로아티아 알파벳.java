import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] str = br.readLine().toCharArray();
        br.close();

        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'c' && i < str.length - 1) {
                if (str[i + 1] == '=' || str[i + 1] == '-') {
                    i++;
                }
            } else if (str[i] == 'd' && i < str.length - 1) {
                if (str[i + 1] == '-') {
                    i++;
                } else if (str[i + 1] == 'z' && i < str.length - 2) {
                    if (str[i + 2] == '=') {
                        i += 2;
                    }
                }
            } else if ((str[i] == 'l' || str[i] == 'n') && i < str.length - 1) {
                if (str[i + 1] == 'j') {
                    i++;
                }
            } else if ((str[i] == 's' || str[i] == 'z') && i < str.length - 1) {
                if (str[i + 1] == '=') {
                    i++;
                }
            }
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }

}