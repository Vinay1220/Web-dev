
public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree1{
        static int idx = -1;
        public   static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+ " ");
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree1 b = new BinaryTree1();
        Node root = b.buildTree(nodes);
        System.out.print("preorder = ");
        preorder(root);
        System.out.println();
        System.out.print("inorder = ");
        inorder(root);
        System.out.println();
        System.out.print("postoreder = ");
        postorder(root);
    }
}