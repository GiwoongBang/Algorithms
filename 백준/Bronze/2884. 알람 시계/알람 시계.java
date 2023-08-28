import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hour, minute;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();

        if (minute >= 45) {
            minute -= 45;
        } else if (hour == 0) {
            hour = 23;
            minute = 60 - (45 - minute);
        } else {
            hour -= 1;
            minute = 60 - (45 - minute);
        }

        System.out.println(hour + " " + minute);
    }

}