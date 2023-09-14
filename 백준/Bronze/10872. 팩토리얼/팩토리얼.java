import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();

        int factorial = 1;
        if (!(num == 0)) {
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
        }
        bw.write(String.valueOf(factorial));
        bw.flush();
        bw.close();
        
    }

}