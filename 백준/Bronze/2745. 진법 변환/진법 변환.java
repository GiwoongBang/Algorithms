import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String num = input[0];
        int radix = Integer.parseInt(input[1]);

        int result = Integer.parseInt(num, radix);
        System.out.println(result);

    }
}