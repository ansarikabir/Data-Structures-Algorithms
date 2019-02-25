package lab5;

public class BinarySearchTree {
	/* Class containing left and right child of current node and key value*/
    class Node
    {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree()
    {
        root = null;
    }
 
    // This method mainly calls deleteRec()
    void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
 
        return root;
    }
 
    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
 // A utility function to search a given key in BST
    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;
     
        // val is greater than root's key
        if (root.key > key)
            return search(root.left, key);
     
        // val is less than root's key
        return search(root.right, key);
    }
    public Node find(int id){
    	
    	
		return search(this.root,id);
		
	}

 
    // This method mainly calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
 
    
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
 
        for(int i=1;i<16;i++){ //1 to 15
        	tree.insert(i);
        }
        
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();
        for(int i=0;i<100000;i++){ //1 to 15
    	tree.find(1);
    	tree.find(15);
    	}
 
        tree.deleteKey(5);
        System.out.println("\nInorder traversal of the modified tree");
        tree.inorder();
        tree.deleteKey(15);
        System.out.println("\nInorder traversal of the modified tree");
        tree.inorder();
        tree.deleteKey(1);
        System.out.println("\nInorder traversal of the modified tree");
        tree.inorder();
        tree.insert(2);
        System.out.println("\nInorder traversal of the modified tree");
        tree.inorder();
        
        BinarySearchTree tree2 = new BinarySearchTree();
        
        tree2.insert(8);
        tree2.insert(4);
        tree2.insert(12);
        tree2.insert(2);
        tree2.insert(6);
        tree2.insert(10);
        tree2.insert(14);
        tree2.insert(1);
        tree2.insert(3);
        tree2.insert(5);
        tree2.insert(7);
        tree2.insert(9);
        tree2.insert(11);
        tree2.insert(13);
        tree2.insert(15);
        System.out.println("\nInorder traversal of the second tree");
        tree2.inorder();
        /*for(int i=0;i<100000;i++){ //1 to 15
    	tree.find(1);
    	tree.find(15);
    	}*/
        tree2.deleteKey(8);
        System.out.println("\nInorder traversal of the modified second tree");
        tree2.inorder();
 
        
    }

}
