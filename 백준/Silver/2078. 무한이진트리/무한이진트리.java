import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int tgLeftNode = Integer.parseInt(st.nextToken());
            int tgRightNode = Integer.parseInt(st.nextToken());

            int contLeft = 0;
            int countRight = 0;

            while (!(tgLeftNode == 1 && tgRightNode == 1)) {
                if (tgLeftNode < tgRightNode) {
                    tgRightNode -= tgLeftNode;
                    countRight++;
                } else {
                    tgLeftNode -= tgRightNode;
                    contLeft++;
                }
            }

            System.out.println(contLeft + " " + countRight);
            
        }
}