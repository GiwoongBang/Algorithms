import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        List<Integer> nums = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums.add(num);
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
        }

        Collections.sort(nums, (o1, o2) -> {
            if (frequency.get(o1).equals(frequency.get(o2))) {
                return Integer.compare(firstIndex.get(o1), firstIndex.get(o2));
            } else {
                return Integer.compare(frequency.get(o2), frequency.get(o1));
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(nums.get(j)).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
