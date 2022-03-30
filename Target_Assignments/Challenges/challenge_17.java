package Challenges;

public class challenge_17{
    static class Node{
        char data;
        Node left;
        Node right;

        public Node(char data){
            this.data = data;
        }
    }

    static void printLeafNodes(Node node){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            System.out.print(node.data + " ");
            return;
        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String[] args) {

        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('F');
        root.left.left = new Node('C');
        root.left.right = new Node('E');
        root.right.left = new Node('G');
        root.right.right = new Node('H');
        root.left.left.left = new Node('D');
        root.right.right.right = new Node('K');

        printLeafNodes(root);

    }
}