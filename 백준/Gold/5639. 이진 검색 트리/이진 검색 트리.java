import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));

        String value;
        while (true) {
            value = br.readLine();
            if (value == null || value.equals("")) break;
            root.insert(Integer.parseInt(value));
        }

        postOrder(root);
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        void insert(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = new Node(value);
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(value);
                } else {
                    this.right.insert(value);
                }
            }
        }
    }

    static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    public static void main(String args[]) throws IOException {
        Main solution = new Main();
        solution.solution();
    }

}