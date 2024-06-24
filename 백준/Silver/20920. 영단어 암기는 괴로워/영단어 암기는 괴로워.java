import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int allWords = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hs = new HashMap<>();

        for (int i = 0; i < allWords; i++) {
            String word = br.readLine();
            if (word.length() < limit) {
                continue;
            }
            hs.put(word, hs.getOrDefault(word, 0) + 1);
        }

        List<String> words = new ArrayList<>(hs.keySet());
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.compare(hs.get(o1), hs.get(o2)) != 0) {
                    return Integer.compare(hs.get(o2), hs.get(o1));
                }

                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int w = 0; w < words.size(); w++) {
            sb.append(words.get(w)).append("\n");
        }
        System.out.print(sb);

    }
}