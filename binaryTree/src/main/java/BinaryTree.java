public class BinaryTree {
  Node root;

  public static Node addNodeToTree(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.data) {
      current.left = addNodeToTree(current.left, value);
    } else if (value > current.data) {
      current.right = addNodeToTree(current.right, value);
    } else {
      return current;
    }
    return current;
  }

  public void add(int value) {
    root = addNodeToTree(root, value);
  }

}
