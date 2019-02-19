public class DepthFirstTraversalOfBinaryTree {

  public static void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.println(" " + node.data);
      traverseInOrder(node.right);
    }
  }

  public static void traversePreOrder(Node node) {
    if (node != null) {
      System.out.println(" " + node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public static void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.println(" " + node.data);
    }
  }
}
