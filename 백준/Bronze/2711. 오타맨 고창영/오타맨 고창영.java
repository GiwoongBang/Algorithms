import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            String[] input = br.readLine().split(" ");
            int index = Integer.parseInt(input[0]) - 1;
            char[] strArray = input[1].toCharArray();

            for (int j = 0; j < strArray.length; j++) {
                if (j != index) bw.write(strArray[j]);
            }
            bw.flush();
            System.out.println();
        }
        br.close();
        bw.close();
    }
}