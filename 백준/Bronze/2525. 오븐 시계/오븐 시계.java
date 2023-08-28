import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hour, minute;
        int cookTime;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();
        cookTime = sc.nextInt();

        minute = minute + cookTime;

        if (minute / 60 != 0) {
            hour = hour + minute / 60;
            minute = minute % 60;
        }

        if (hour > 23) {
            hour = hour % 24;
        }
        if (minute > 59) {
            minute = minute % 60;
        }

        System.out.println(hour + " " + minute);
    }

}