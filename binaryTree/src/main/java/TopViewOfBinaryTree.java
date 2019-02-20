import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopViewOfBinaryTree {
  private static Map<Integer, Integer> nodeHashMap = new HashMap<>();
  private static Queue<NodeHorizontalDistPair> discoveredNodeQueue = new LinkedList<>();

  public static void printTopView(Node root) {
    if (root == null) {
      return;
    }
    discoveredNodeQueue.add(new NodeHorizontalDistPair(root, 0));

    while (!discoveredNodeQueue.isEmpty()) {
      Node temp = discoveredNodeQueue.peek().node;
      int hd = discoveredNodeQueue.peek().horizontalDistance;
      discoveredNodeQueue.remove();
      if (!nodeHashMap.containsKey(hd)) {
        nodeHashMap.put(hd, temp.data);
        System.out.println(" " + temp.data);
      }
      if (temp.left != null) {
        discoveredNodeQueue.add(new NodeHorizontalDistPair(temp.left, hd - 1));
      }
      if (temp.right != null) {
        discoveredNodeQueue.add(new NodeHorizontalDistPair(temp.right, hd + 1));
      }
    }
  }

  public static void main(String[] args) {
    Node root = new Node(25);
    root.left = new Node(10);
    root.left.left = new Node(6);
    root.left.right = new Node(15);
    root.left.left.left = new Node(4);
    root.left.left.left.left = new Node(1);
    root.right = new Node(35);
    root.right.right = new Node(40);
    printTopView(root);
  }
}
