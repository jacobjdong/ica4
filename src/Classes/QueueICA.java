// Jacob Dong jjd180002
// Santhosh Karunakaran sxk190182

package Classes;
import java.util.*;

public class QueueICA {
    Node root = null;

    public Node getNode() {
        Node temp = root;
        root = root.getLeft();
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
               
       		while (true)
        	{
			if (cur.left == null)
			{
				cur.left = n;
				return;
			}
        	        cur = cur.left;
		    }
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