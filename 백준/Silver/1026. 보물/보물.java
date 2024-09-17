import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        int arrays = Integer.parseInt(br.readLine());

        int[] arrA = new int[arrays];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrays; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);

        List<Integer> arrB = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < arrays; j++) {
            arrB.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrB, Collections.reverseOrder());

        for (int k = 0; k < arrays; k++) {
            sum += arrA[k] * arrB.get(k);
        }
        System.out.print(sum);

    }

}
