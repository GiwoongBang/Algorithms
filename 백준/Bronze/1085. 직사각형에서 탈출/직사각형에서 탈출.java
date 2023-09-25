import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        int maxX, maxY;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        maxX = w - x;
        maxY = h - y;

        int nearZero = Math.min(x, y);
        int nearMax = Math.min(maxX, maxY);

        int result = Math.min(nearZero, nearMax);

        System.out.println(result);
    }

}