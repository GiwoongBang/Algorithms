import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();

        for (int num = startNum; num <= endNum; num++) {
            if (isCheck(num)) {
                System.out.println(num);
            }
        }

    }

    private static boolean isCheck(int num) {
        if (num <= 1) {
            return false;
        }

        for (int j = 2; j * j <= num; j++) {
            if ((num % j) == 0) {
                return false;
            }
        }
        return true;
    }

}