import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];

        while(sc.hasNextLine()) {
            String sentence = sc.nextLine();
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                    alphabet[sentence.charAt(i) - 'a']++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }

    }

}