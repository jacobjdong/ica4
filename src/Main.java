import Classes.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BinaryTree treee = new BinaryTree();
        Node addNode = new Node(9);
        treee.insert(addNode);
        for (int i=0; i<9; i++) {
            addNode.setNum(addNode.getNum() * 2);
        }
        treee.displayTree();
    }
}