import java.io.*;
import java.util.StringTokenizer;

// 6 3 2
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int woman = Integer.parseInt(st.nextToken());
        int man = Integer.parseInt(st.nextToken());
        int intern = Integer.parseInt(st.nextToken());

        int womanShare = woman / 2;
        int result = Math.min(womanShare, man);

        int womanRest = woman - (result * 2);
        int manRest = man - result;
        int allRemain = womanRest + manRest;

        while (intern > allRemain) {
            result -= 1;
            allRemain += 3;
        }

        System.out.print(result);
    }

}