import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {


        boolean[] check = new boolean[10000];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i) - 1;

            if (n < 10000) {
                check[n] = true;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (!check[i]) {
                System.out.println(i + 1);
            }
        }

    }

    private static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

}