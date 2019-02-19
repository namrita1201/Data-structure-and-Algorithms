public class PopulateAndPrintBinaryTree {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.add(25);
    binaryTree.add(10);
    binaryTree.add(45);
    binaryTree.add(6);
    binaryTree.add(4);
    binaryTree.add(8);
    binaryTree.add(30);
    binaryTree.add(50);
    binaryTree.add(20);
    binaryTree.add(35);

    System.out.println("*********DEPTH FIRST SEARCH**************");
    System.out.println("\nInOrder traversal of the binary\n ");
    DepthFirstTraversalOfBinaryTree.traverseInOrder(binaryTree.root);

    System.out.println("\nPreOrder traversal of the binary\n ");
    DepthFirstTraversalOfBinaryTree.traversePreOrder(binaryTree.root);

    System.out.println("\nPostOrder traversal of the binary\n ");
    DepthFirstTraversalOfBinaryTree.traversePostOrder(binaryTree.root);

    System.out.println("*********BREADTH FIRST SEARCH**************");
    System.out.println("\nLevelOrder traversal of the binary\n ");
    BreadthFirstTraversalOfBinaryTree.traverseLevelOrder(binaryTree);
  }
}
