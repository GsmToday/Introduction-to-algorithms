import java.util.*;
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        TreeNode current = root;
        stack.push(current);
        
		while(stack.isEmpty()!=true){
            current = stack.pop();
            list.add(current.val);
            if(current.right!=null){
                stack.push(current.right);
            }
            if(current.left!=null){
                stack.push(current.left);
            }

        }
        return list;
    }
}

class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
        TreeNode(int x) { val = x; }
	 }