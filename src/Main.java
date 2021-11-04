import Classes.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BinaryTree treee = new BinaryTree();
        createAndAddNode(-9,treee);
        createAndAddNode(0,treee);
        createAndAddNode(14,treee);
        createAndAddNode(1,treee);
        createAndAddNode(-3,treee);
        createAndAddNode(-19,treee);
        createAndAddNode(9,treee);
        createAndAddNode(4,treee);
        createAndAddNode(32,treee);

        treee.displayTree();
    }

    public static void createAndAddNode(int n, BinaryTree tree) {
        Node addNode = new Node(n);
        tree.insert(addNode);
        System.out.println(n);
    }
}