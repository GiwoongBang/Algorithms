import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int round = 10;

        int[] numsA = new int[round];
        putNums(br, round, numsA);

        int[] numsB = new int[round];
        putNums(br, round, numsB);

        int scoreA = 0;
        int scoreB = 0;
        char finalWinner = 'D';
        for (int k = 0; k < round; k++) {
            if (numsA[k] > numsB[k]) {
                finalWinner = 'A';
                scoreA += 3;
            } else if (numsA[k] < numsB[k]) {
                finalWinner = 'B';
                scoreB += 3;
            } else {
                scoreA += 1;
                scoreB += 1;
            }
        }
        System.out.println(scoreA + " " + scoreB);

        if (scoreA > scoreB) {
            System.out.print('A');
        } else if (scoreA < scoreB) {
            System.out.print('B');
        } else {
            System.out.print(finalWinner);
        }
    }

    private static void putNums(BufferedReader br, int round, int[] nums) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < round; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }

}