import java.io.*;

/*
1 6 19 44
1 5 14 30
1 4 10 20
1 3 6 10
1 2 3 4
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            int[] people = new int[room];
            for (int p = 0; p < room; p++) {
                people[p] = p + 1;
            }

            for (int f = 0; f < floor; f++) {
                int[] result = new int[room];
                for (int r1 = 0; r1 < room; r1++) {
                    for (int r2 = 0; r2 <= r1; r2++) {
                        result[r1] += people[r2];
                    }
                }
                people = result;
            }
            bw.write(people[room -1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}