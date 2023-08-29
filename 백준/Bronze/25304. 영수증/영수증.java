import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int reciptCost;
        int checkCost = 0;
        int allProducts;

        Scanner sc = new Scanner(System.in);
        reciptCost = sc.nextInt();
        allProducts = sc.nextInt();

        for (int i = 0; i < allProducts; i++) {
            int productCount = sc.nextInt();
            int price = sc.nextInt();

            int sum = productCount * price;
            checkCost += sum;
        }

        if (reciptCost == checkCost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }

}