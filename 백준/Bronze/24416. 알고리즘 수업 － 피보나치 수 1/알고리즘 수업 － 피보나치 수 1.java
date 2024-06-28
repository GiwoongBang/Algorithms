import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int code1;
    static int code2;
    static int[] f;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        code1 = 0;
        code2 = 0;
        f = new int[n];

        fib(n);
        fibonacci(n);

        StringBuilder sb = new StringBuilder();
        sb.append(code1).append(" ").append(code2);
        System.out.print(sb);

    }

    static int fib(int num) {
        if (num == 1 || num == 2) {
            code1++;
            return 1;
        } else return (fib(num - 1) + (fib(num - 2)));
    }

    static int fibonacci(int num) {
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < num; i++) {
            code2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[num - 1];
    }

}