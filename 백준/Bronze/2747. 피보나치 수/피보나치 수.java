import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long first = 0;
        long second = 1;

        if (n == 1) {
            System.out.print(1);
        } else {
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            System.out.print(result);

        }
    }
}