import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        char[] charArray = br.readLine().toCharArray();
        br.close();

        int[] numArray = new int[charArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (byte) charArray[i];
        }

        for (int i = 0; i < numArray.length; i++) {
            switch (numArray[i]) {
                case 65:
                case 66:
                case 67:
                    numArray[i] = 3;
                    break;
                case 68:
                case 69:
                case 70:
                    numArray[i] = 4;
                    break;
                case 71:
                case 72:
                case 73:
                    numArray[i] = 5;
                    break;
                case 74:
                case 75:
                case 76:
                    numArray[i] = 6;
                    break;
                case 77:
                case 78:
                case 79:
                    numArray[i] = 7;
                    break;
                case 80:
                case 81:
                case 82:
                case 83:
                    numArray[i] = 8;
                    break;
                case 84:
                case 85:
                case 86:
                    numArray[i] = 9;
                    break;
                case 87:
                case 88:
                case 89:
                case 90:
                    numArray[i] = 10;
                    break;
            }
        }

        for (int resultNum : numArray) {
            sum += resultNum;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }

}