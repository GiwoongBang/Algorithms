import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static boolean check() throws IOException {
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);


            if (prev != now) {
                if (!alphabet[now - 'a']) {
                    alphabet[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
        
    }

}