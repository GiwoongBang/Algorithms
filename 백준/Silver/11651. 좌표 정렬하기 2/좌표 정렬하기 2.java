import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int loop = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[loop][2];

        // 미리 선언한 coordinates 배열에 좌표 할당
        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinates, (arr1, arr2) -> {
                    if (arr1[1] == arr2[1]) { // Y 좌표(coordinates 배열의 1번째 인덱스)가 같으면,
                        return arr1[0] - arr2[0]; // X 좌표(coordinates 배열의 0번째 인덱스) 기준으로 정렬
                    } else {
                        return arr1[1] - arr2[1]; // Y 좌표 기준으로 정렬
                    }
                }
        );

        sb = new StringBuilder();
        for (int j = 0; j < loop; j++) {
            sb.append(coordinates[j][0]).append(" ").append(coordinates[j][1]).append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}