import java.util.Scanner;
import java.util.Stack;

public class Level_Order_ZigZag_Binary_Tree {



    private class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;
    }
    
    public static TreeNode root1;

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

    public void ZigZag_Traversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();

        currentLevel.push(root);

        boolean leftToRight = true;

        while(!currentLevel.isEmpty())
        {
            TreeNode node = currentLevel.pop();
            System.out.print(node.data + " ");

            if(leftToRight)
            {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            }
            else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }
            
            if(currentLevel.isEmpty())
            {
                leftToRight = !leftToRight;

                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
    

    public static void main(String[] args) {
        
        Level_Order_ZigZag_Binary_Tree obj = new Level_Order_ZigZag_Binary_Tree();

        root1 = obj.CreateNode(root1);

        obj.ZigZag_Traversal(root1);
    }
}
