import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            Stack<Character> strStack = new Stack<>();
            boolean isYes = true;

            String inputStr = br.readLine();
            if (inputStr.equals(".")) {
                break;
            }

            char[] strArr = inputStr.toCharArray();
            for (int i = 0; i < strArr.length; i++) {

                if (strArr[i] == '(' || strArr[i] == '[') {
                    strStack.push(strArr[i]);
                }

                if (strArr[i] == ')') {
                    if (strStack.isEmpty() || strStack.peek() != '(') {
                        isYes = false;
                        break;
                    } else {
                        strStack.pop();
                    }
                }

                if (strArr[i] == ']') {
                    if (strStack.isEmpty() || strStack.peek() != '[') {
                        isYes = false;
                        break;
                    } else {
                        strStack.pop();
                    }
                }
            }
            if (strStack.size() > 0 || !isYes) {
                bw.write("no\n");
            } else {
                bw.write("yes\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}