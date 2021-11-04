import java.util.*;

public class QueueICA implements Queue{
    Queue<Node<E>> queue = new BinaryTree<Node<E>>();

if(root != null)
    {
        queue.add(root);
    }

while(!queue.isEmpty())
    {
        TreeNode<E> temp = queue.remove();

        System.out.println(temp);

        if(temp.left != null)
        {
            queue.add(temp.left);
        }
        if(temp.right != null)
        {
            queue.add(temp.right);
        }
    }
}

