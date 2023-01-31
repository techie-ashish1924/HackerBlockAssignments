import java.util.Scanner;

public class Is_Balanced_Binary_Tree {


    private class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

    }
    
    public static TreeNode root;

    public TreeNode CreateNode(TreeNode root)
    {

        Scanner sc = new Scanner(System.in);

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


        // int val = sc.nextInt();
        // TreeNode nn = new TreeNode();

        // nn.data = val;

        // boolean hlc = sc.nextBoolean();

        // if (hlc) {
        //     nn.left = CreateNode(root);
        // }

        // boolean hrc = sc.nextBoolean();

        // if (hrc) {
        //     nn.right = CreateNode(root);
        // }

        // return nn;
        

    }
 
    // public static int Height(TreeNode root)
    // {
    //     if(root == null)
    //     {
    //         return 0;
    //     }

    //     int lheight = Height(root.left);
    //     int rheight = Height(root.right);

    //     return Math.max(lheight, rheight) + 1;
    // }
    
    // public boolean IsBalanced(TreeNode root)
    // {
    //     if(root == null)
    //     {
    //         return true;
    //     }

    //     boolean left = IsBalanced(root.left);
    //     boolean right = IsBalanced(root.right);
    //     boolean isbal = Math.abs(Height(root.left) - Height(root.right)) <= 1;

    //     return left && right && isbal;

    // }



    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        Is_Balanced_Binary_Tree obj = new Is_Balanced_Binary_Tree();
        root = obj.CreateNode(root);
        // System.out.println(obj.Height(root));
        // System.out.println(obj.IsBalanced(root));

    }
    
}
