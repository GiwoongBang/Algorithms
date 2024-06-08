import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    트리: https://www.acmicpc.net/problem/1068
 */

public class Main {

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int minPackagePrice = 1000;
        int minIndividualPrice = 1000;
        int minPrice = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        int guitarString = Integer.parseInt(st.nextToken());
        int brand = Integer.parseInt(st.nextToken());

        for (int i = 0; i < brand; i++) {
            st = new StringTokenizer(br.readLine());
            minPackagePrice = Math.min(minPackagePrice, Integer.parseInt(st.nextToken()));
            minIndividualPrice = Math.min(minIndividualPrice, Integer.parseInt(st.nextToken()));
        }

        int packagesNeeded = (guitarString + 5) / 6;
        int packagesOnly = packagesNeeded * minPackagePrice;
        int mixed = (guitarString / 6) * minPackagePrice + (guitarString % 6) * minIndividualPrice;
        int individualsOnly = guitarString * minIndividualPrice;

        minPrice = Math.min(minPrice, Math.min(packagesOnly, Math.min(mixed, individualsOnly)));
        System.out.print(minPrice);
}

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }
}