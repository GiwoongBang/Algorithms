import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        HashSet<String> allWords = new HashSet<>();
        for (int i = 0; i < loop; i++) {
            allWords.add(br.readLine());
        }

        List<String> filteredWords = new ArrayList<>(allWords);

        Collections.sort(filteredWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int length = o1.length();
                    for (int l = 0; l < length; l++) {
                        if (o1.charAt(l) != o2.charAt(l)) {
                            return Character.compare(o1.charAt(l), o2.charAt(l));
                        }
                    }
                    return 0;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for (String filteredWord : filteredWords) {
            System.out.println(filteredWord);
        }

    }

}