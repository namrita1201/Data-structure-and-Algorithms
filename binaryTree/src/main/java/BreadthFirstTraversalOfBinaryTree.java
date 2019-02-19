import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversalOfBinaryTree {

  public static void traverseLevelOrder(BinaryTree binaryTree) {
    if (binaryTree.root == null) {
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(binaryTree.root);
    while (!queue.isEmpty()) {
      Node current = queue.remove();
      System.out.println(" " + current.data);
      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
  }

}
