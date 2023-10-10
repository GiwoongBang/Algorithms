import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String firstResist = br.readLine();
        String secondResist = br.readLine();
        String thiredResist = br.readLine();

        br.close();

        long result = (Arrays.asList(color).indexOf(firstResist) * 10) + Arrays.asList(color).indexOf(secondResist);
        result *= Math.pow(10,Arrays.asList(color).indexOf(thiredResist));

        System.out.println(result);
    }

}