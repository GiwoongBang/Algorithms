import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            char[] indexChar = br.readLine().toCharArray();
            char[] alphabet = br.readLine().toCharArray();
            
            for (int j = 0; j < indexChar.length; j++) {
                char check = indexChar[j];
                if (check == ' ') {
                    bw.write(' ');
                } else {
                    int index = (int) (check - 65);
                    bw.write(alphabet[index]);
                }
            }
            bw.write('\n');
            bw.flush();
        }
    }
}