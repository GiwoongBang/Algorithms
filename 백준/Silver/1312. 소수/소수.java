import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> point = new ArrayList<>();

        int share;
        int rest;
        int count = 0;

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        if (B > A) {
            A *= 10;
            share = A / B;
            point.add(share);
            count++;
        }
        rest = A % B;

        while (N > count) {
            if (rest == 0) {
                break;
            }
            rest *= 10;
            share = rest / B;
//            if (point.contains(share)) {
//                break;
//            }
            point.add(share);
            count++;
            rest %= B;
        }

//        int pointSize = point.size();
//        if (pointSize == 1) {
//            System.out.print(point.get(0));
//        } else if (pointSize >= N) {
//            System.out.print(point.get(N - 1));
//        } else {
//            int index = N % pointSize;
//            System.out.print(point.get(index - 1));
//        }
        if (N > point.size()) {
            System.out.print(0);
        } else {
            System.out.print(point.get(N - 1));
        }

    }

}