import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int left, right;
        int num;
        int count = 0;
        String convert;

        int result = Integer.parseInt(br.readLine());
        num = result;
        br.close();
        
        do {
            count++;

            left = num / 10;
            right = num % 10;
            num = left + right;

            convert = String.valueOf(right) + (num % 10);
            num = Integer.parseInt(convert);

        } while (result != num);

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }

}