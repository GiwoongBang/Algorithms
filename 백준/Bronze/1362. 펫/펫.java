import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int scene = 1;
        String condition = "";

        StringTokenizer firstActive = new StringTokenizer(br.readLine());
        int standardWeight = Integer.parseInt(firstActive.nextToken());
        int myWeight = Integer.parseInt(firstActive.nextToken());

        do {
            if (standardWeight == 0 && myWeight == 0) break;

            StringTokenizer inputActive = new StringTokenizer(br.readLine());
            String activity = inputActive.nextToken();
            int time = Integer.parseInt(inputActive.nextToken());

            if (activity.equals("F") && !condition.equals("RIP")) {
                myWeight += time;
                condition = checkConditon(condition, standardWeight, myWeight);
            } else if (activity.equals("E") && !condition.equals("RIP")) {
                myWeight -= time;
                condition = checkConditon(condition, standardWeight, myWeight);
            } else if (activity.equals("#")) {
                condition = checkConditon(condition, standardWeight, myWeight);
                System.out.println(scene + " " + condition);
                scene++;
                condition = "";

                StringTokenizer nextActive = new StringTokenizer(br.readLine());
                standardWeight = Integer.parseInt(nextActive.nextToken());
                myWeight = Integer.parseInt(nextActive.nextToken());
            }
        } while (true);

    }

    private static String checkConditon(String condition, int standardWeight, int myWeight) {

        if ((standardWeight / 2) < myWeight && myWeight < (standardWeight * 2)) {
            condition = ":-)";
        } else if ((myWeight > 0 && myWeight <= standardWeight / 2) || standardWeight * 2 <= myWeight) {
            condition = ":-(";
        } else if (myWeight <= 0) {
            condition = "RIP";
        }

        return condition;
    }

}