import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;

        String result;
        if(month == 1) {
            result = dayOfTheWeek(day, count);
        } else {
            for(int i = 0; i < month - 1; i++) {
                count += days[i];
            }
            result = dayOfTheWeek(day, count);
        }

        System.out.print(result);
    }

    private static String dayOfTheWeek(int day, int count) {
        count += day;
        int remain = count % 7;

        String dayName = null;
        switch (remain) {
            case 0: dayName = "SUN"; break;
            case 1: dayName = "MON"; break;
            case 2: dayName = "TUE"; break;
            case 3: dayName = "WED"; break;
            case 4: dayName = "THU"; break;
            case 5: dayName = "FRI"; break;
            case 6: dayName = "SAT"; break;
        }

        return dayName;
    }

}