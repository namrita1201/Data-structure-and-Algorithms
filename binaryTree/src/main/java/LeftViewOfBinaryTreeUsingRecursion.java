public class LeftViewOfBinaryTreeUsingRecursion {
  public static int maxLevel = 0;

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(12);
    root.right = new Node(3);
    root.left.right = new Node(4);
    root.right.left = new Node(5);
    root.right.left.right = new Node(6);
    root.right.left.right.left = new Node(18);
    root.right.left.right.right = new Node(7);

    leftView(root);
  }

  public static void leftView(Node node) {
    printLeftView(node, 1);
  }

  public static void printLeftView(Node node, int level) {
    if (node == null) {
      return;
    }

    if (maxLevel < level) {
      System.out.println(" " + node.data);
      maxLevel = level;
    }

    printLeftView(node.left, level + 1);
    printLeftView(node.right, level + 1);
  }

}