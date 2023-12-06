import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int chicken = sc.nextInt();
            int k = sc.nextInt();

            int sum = chicken;
            while (true) {
                if (chicken / k > 0) {
                    sum += chicken / k;
                    chicken = (chicken % k) + (chicken / k);
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }

    }

}