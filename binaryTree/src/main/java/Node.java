public class Node {

  public int data;
  Node right;
  Node left;

  public Node(final int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(final int data) {
    this.data = data;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(final Node right) {
    this.right = right;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(final Node left) {
    this.left = left;
  }
}

