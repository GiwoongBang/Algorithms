import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, Integer> name = new HashMap<>();
        HashMap<Integer, String> number = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int pokemon = Integer.parseInt(st.nextToken());
        int check = Integer.parseInt(st.nextToken());

        for (int p = 1; p <= pokemon; p++) {
            String pokemonName = br.readLine();
            name.put(pokemonName, p);
            number.put(p, pokemonName);
        }

        for (int c = 0; c < check; c++) {
            String input = br.readLine();
            if (49 <= input.charAt(0) && input.charAt(0) <= 57) {
                sb.append(number.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(name.get(input)).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}