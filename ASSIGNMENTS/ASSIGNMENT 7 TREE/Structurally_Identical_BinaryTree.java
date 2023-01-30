import java.util.Scanner;

public class Structurally_Identical_BinaryTree {


    private class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;
    }

    public static TreeNode root1,root2;
    Scanner sc = new Scanner(System.in);

    public TreeNode CreateNode(TreeNode root)
    {
        int item = sc.nextInt();
        TreeNode nn = new TreeNode();
        nn.data = item;

        boolean hlc = sc.nextBoolean();

        if (hlc) {
            nn.left = CreateNode(root);
        }

        boolean hrc = sc.nextBoolean();

        if (hrc) {
            nn.right = CreateNode(root);
        }

        return nn;
    }
    
    public boolean Structure(TreeNode root1,TreeNode root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }
        if(root1.data != root2.data)
        {
            return false;
        }

        return Structure(root1.left, root2.left) || Structure(root1.right, root2.right);
    }




    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        Structurally_Identical_BinaryTree obj1 = new Structurally_Identical_BinaryTree();
        root1 = obj1.CreateNode(root1);
        root2 = obj1.CreateNode(root2);

        System.out.println(obj1.Structure(root1, root2));


        

        
    }
    
}
