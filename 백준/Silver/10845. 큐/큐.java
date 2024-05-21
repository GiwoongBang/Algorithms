import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int element = Integer.parseInt(st.nextToken());
                    nums.add(element);
                    break;

                case "pop":
                    if (nums.size() == 0) {
                        System.out.println(-1);
                    } else {
                        Integer firstElement = nums.get(0);
                        System.out.println(firstElement);
                        nums.remove(firstElement);
                    }
                    break;

                case "size":
                    int size = nums.size();
                    System.out.println(size);
                    break;

                case "empty":
                    boolean isEmpty = nums.isEmpty();
                    if (isEmpty) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if (nums.size() == 0) {
                        System.out.println(-1);
                    } else {
                        Integer firstElement = nums.get(0);
                        System.out.println(firstElement);
                    }
                    break;

                case "back":
                    if (nums.size() == 0) {
                        System.out.println(-1);
                    } else {
                        Integer lastElement = nums.get(nums.size() - 1);
                        System.out.println(lastElement);
                    }
                    break;
            }
        }

    }
}