import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Binary_Traversal {


    private class TreeNode {
        int data;

        TreeNode left;
        TreeNode right;
    }
    
    public static TreeNode root;
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
    
    // public int Height(TreeNode root)
    // {
    //     if (root == null) {
    //         return 0;
    //     } else {

    //         int lheight = Height(root.left);
    //         int rheight = Height(root.right);

    //         return Math.max(lheight, rheight) + 1;
    //     }
    // }
    
    // public void printCurrentLevel(TreeNode root,int level,ArrayList<Integer>arr,ArrayList<ArrayList<Integer>> ans)
    // {
    //     if (root == null) {
    //         return;
    //     }
    //     if (level == 1) {
    //         arr.add(root.data);
    //         // System.out.println(root.data + " ");
    //     }

    // }
    
    public ArrayList<ArrayList<Integer>> levelArrayList() {

        // write your code here
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return answer;
        }

        // add something
        queue.add(root);

        // rstarting bfs
        while (!queue.isEmpty()) {

            // find the size pf queue will tell us no.of node at particular level
            int currentSize = queue.size();

            // process these operation(remove,do something,process children)currentsize
            // times
            ArrayList<Integer> currentLevel = new ArrayList<>();

            while (currentSize > 0) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.data);

                // process children

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                currentSize -= 1;
            }
            answer.add(currentLevel);

        }
        return answer;
    }

    public static void main(String[] args) {

        Level_Order_Binary_Traversal obj = new Level_Order_Binary_Traversal();
        root = obj.CreateNode(root);
        System.out.println(obj.levelArrayList());
        

    }
    
}
