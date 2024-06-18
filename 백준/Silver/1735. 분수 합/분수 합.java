import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numA = Integer.parseInt(st.nextToken());
        int denumA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int numB = Integer.parseInt(st.nextToken());
        int denumB = Integer.parseInt(st.nextToken());
        br.close();

        int num = (numA * denumB) + (numB * denumA);
        int denum = denumA * denumB;

        if (num > denum) {
            int GCD = euclidean(num, denum);
            System.out.print(num / GCD + " " + denum / GCD);
        } else if (num < denum) {
            int GCD = euclidean(denum, num);
            System.out.print(num / GCD + " " + denum / GCD);
        } else {
            System.out.print("1 1");
        }
    }

    static int euclidean(int A, int B) {
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }
        return A;
    }

}