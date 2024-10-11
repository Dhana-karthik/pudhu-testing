// Class describing a node of tree
class Node {
 
  int data;
  Node left;
  Node right;
  Node(int v)
  {
    this.data = v;
    this.left = this.right = null;
  }
}