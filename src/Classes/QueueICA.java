// Jacob Dong jjd180002
// Santhosh Karunakaran sxk190182

package Classes;

public class QueueICA {
    Node root;

    public QueueICA() {
        root = null;
    }

    public Node getNode() {
        Node temp = root;
        if (root.getNext() != null) {
            root = root.getNext();
        }
        else {
            root = null;
        }
        return temp;
    }

    public void addNode(Node n)
    {
        if (root == null)
        {
            root = n;
            return;
        }
        else
	    {  
        	Node cur = root;
               
       		while ((cur != null) && (cur.getNext()) != null)
        	{
                System.out.println(cur.getNext().getNum());
        	    cur = cur.getNext();
		    }
            cur.setNext(n);
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        else {
            return false;
        }
    }
}