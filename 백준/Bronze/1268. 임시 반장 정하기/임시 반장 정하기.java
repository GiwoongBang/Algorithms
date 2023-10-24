import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentNum = Integer.parseInt(br.readLine());
        int[][] table = new int[studentNum][5];
        int grade = 0;
        int num = 0;

        for (int i = 0; i < studentNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < studentNum; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < studentNum; k++) {
                    if (i == k) continue;
                    if (table[i][j] == table[k][j]) {
                        set.add(k);
                    }
                }
            }
            if (num < set.size()) {
                num = set.size();
                grade = i + 1;
            }
        }
        if (grade == 0) {
            System.out.println(1);
        } else {
            System.out.println(grade);
        }

    }

}