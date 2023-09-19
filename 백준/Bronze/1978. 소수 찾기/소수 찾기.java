import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int primeNum = 0;

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int num = sc.nextInt();

            if (isPrime(num)) {
                primeNum++;
            }
        }
        System.out.print(primeNum);
    }

    // 소수 여부를 확인하는 함수
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}